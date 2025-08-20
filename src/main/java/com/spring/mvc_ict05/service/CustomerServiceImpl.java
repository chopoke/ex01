package com.spring.mvc_ict05.service;

import java.io.IOException;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.spring.mvc_ict05.dao.CustomerDAO;
import com.spring.mvc_ict05.dto.CustomerDTO;



@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerDAO dao;
	
	//id 중복확인
	@Override
	public void idconfirmaction(HttpServletRequest request, HttpServletResponse response, Model model)
			throws ServletException, IOException {
		System.out.println("CustomerServiceImpl - idconfirmaction");
		//3. 화면에서 입력받은 값을 가져온다.
		String id = request.getParameter("user_id");
		//4. 싱글톤 방식으로 dao 객체 생성, 다형성 적용
		//CustomerDAO dao = CustomerDAOImpl.getIns();
		//5. id중복확인 처리
		int ckid = dao.useridcheck(id);
		//6. jsp로 처리결과 전달
		model.addAttribute("ckid", ckid);
		model.addAttribute("id", id);
	}
//	//회원가입 처리
	@Override
	public void signinaction(HttpServletRequest request, HttpServletResponse response, Model model)
			throws ServletException, IOException {
		System.out.println("CustomerServiceImpl - signinaction");
		//3. 화면에서 입력받은 값을 가져와서 dto의 setter를 통해 값전달
		
		//dto생성 -> setter -> 맴버변수
		CustomerDTO dto =new CustomerDTO();
		dto.setUser_id(request.getParameter("user_id"));;
		dto.setUser_password(request.getParameter("user_password"));
		dto.setUser_name(request.getParameter("user_name"));
		dto.setUser_birthday(Date.valueOf(request.getParameter("user_birthday")));
		dto.setUser_address(request.getParameter("user_address"));
		//연락처는 필수가 아니므로 null값이 들어올수 있으므로 값이 존재할때만 받아온다. (010 1234 5678)
		String hp ="";
		String hp1 = request.getParameter("user_hp1");
		String hp2 = request.getParameter("user_hp2");
		String hp3 = request.getParameter("user_hp3");
		if(!hp1.equals("") && !hp2.equals("") && !hp3.equals("")) {
			hp = hp1 + "-" + hp2 + "-" + hp3;
		}
		dto.setUser_hp(hp);
		
		String email ="";
		String email1 = request.getParameter("user_email1");
		String email2 = request.getParameter("user_email2");
		email = email1 + "@" + email2;
		dto.setUser_email(email);
		//등록일. 아래문장 생략시 sysdate가 사용됨
		dto.setUser_regdate(new Timestamp(System.currentTimeMillis()));
		
		//4. 싱글톤 방식으로 dao 객체 생성, 다형성 적용
		//CustomerDAO dao = CustomerDAOImpl.getIns();
		
		//5. 회원가입 처리
		int insertcnt = dao.insertcustomer(dto);
		//6. jsp로 처리결과 전달
		model.addAttribute("insertcnt", insertcnt);
	}
	//로그인처리, 회원정보 인증(수정, 탈퇴)
	@Override
	public void loginaction(HttpServletRequest request, HttpServletResponse response, Model model)
			throws ServletException, IOException {
		System.out.println("CustomerServiceImpl - loginaction");
		
		//3. 화면에서 입력받은 값을 가져온다.
		String id = request.getParameter("user_id");
		String pw = request.getParameter("user_password");
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("id", id);
		map.put("pw", pw);
		
		//4. 싱글톤 방식으로 dao 객체 생성, 다형성 적용
//		CustomerDAO dao = CustomerDAOImpl.getIns();
		//5. id, pw
//		int selcnt = dao.idpasswordchk(id, pw);
		int selcnt = dao.idpasswordchk(map);
		//6. 로그인 성공시 세션 id를 설정
		if(selcnt == 1) {
			//request.getSession().setAttribute(pw, dao);
			HttpSession session = request.getSession();
			session.setAttribute("sessionid", id);
			//위 아래 두가지 동일한 방식
			request.getSession().setAttribute("sessionpw", pw);
			
			
		}
	}
	//회원정보 인증 처리 및 탈퇴
	@Override
	public void deletecustomeraction(HttpServletRequest request, HttpServletResponse response, Model model)
			throws ServletException, IOException {
		System.out.println("CustomerServiceImpl - deletecustomeraction");
		
		String id = (String)request.getSession().getAttribute("sessionid");
		String pw = request.getParameter("user_password");
//		CustomerDAO dao = CustomerDAOImpl.getIns();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("id", id);
		map.put("pw", pw);
		
		int selectcnt = dao.idpasswordchk(map);
		System.out.println(id + ", " + pw);
		System.out.println(selectcnt);
		int delcnt = 0;
		
		if (selectcnt == 1) {
			delcnt = dao.deletecustomer(id);
			if(delcnt == 1) {
				request.getSession().invalidate();	
			}
		}
		model.addAttribute("selectcnt", selectcnt);
		model.addAttribute("delcnt", delcnt);
		System.out.println(selectcnt);
		System.out.println(delcnt);
		
		/*
		 * // 4-2단계. 회원정보 인증성공시 if(selectCnt == 1) { request.setAttribute("selectCnt",
		 * selectCnt); // 5-2단계. 탈퇴처리 deleteCnt = getInstance.deleteCustomer(sessionID);
		 * if(deleteCnt == 1) { request.getSession().invalidate();
		 * request.setAttribute("deleteCnt", deleteCnt); } }
		 */
	}
	
	//회원정보 인증 상세페이지 처리
	@Override
	public void modifydetailaction(HttpServletRequest request, HttpServletResponse response, Model model)
			throws ServletException, IOException {
		System.out.println("CustomerServiceImpl - modifydetailaction");
		
		String id = (String)request.getSession().getAttribute("sessionid");
		String pw = request.getParameter("user_password");
		
//		CustomerDAO dao = CustomerDAOImpl.getIns();
		CustomerDTO dto = null;
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("id", id);
		map.put("pw", pw);
		
		int selcnt = dao.idpasswordchk(map);
		
		if (selcnt == 1) {
			dto = dao.getcustomerdetail(id);
		}
		model.addAttribute("selcnt", selcnt);
		request.setAttribute("dto", dto);
		
//		System.out.println(id + ", " + pw);
	}
	//회원정보 수정처리
	@Override
	public void modifycustomeraction(HttpServletRequest request, HttpServletResponse response, Model model)
			throws ServletException, IOException {
		System.out.println("CustomerServiceImpl - modifycustomeraction");
		
		CustomerDTO dto =new CustomerDTO();
		//입력받은 값이 없으므로 세션에서 아이디를 받아온다.
		dto.setUser_id((String)request.getSession().getAttribute("sessionid"));
		dto.setUser_password(request.getParameter("user_password"));
		dto.setUser_name(request.getParameter("hidden_user_name"));
		dto.setUser_birthday(Date.valueOf(request.getParameter("user_birthday")));
		dto.setUser_address(request.getParameter("user_address"));
		//연락처는 필수가 아니므로 null값이 들어올수 있으므로 값이 존재할때만 받아온다. (010 1234 5678)
		String hp ="";
		String hp1 = request.getParameter("user_hp1");
		String hp2 = request.getParameter("user_hp2");
		String hp3 = request.getParameter("user_hp3");
		if(!hp1.equals("") && !hp2.equals("") && !hp3.equals("")) {
			hp = hp1 + "-" + hp2 + "-" + hp3;
		}
		dto.setUser_hp(hp);
		
		String email ="";
		String email1 = request.getParameter("user_email1");
		String email2 = request.getParameter("user_email2");
		email = email1 + "@" + email2;
		dto.setUser_email(email);
				
		//4. 싱글톤 방식으로 dao 객체 생성, 다형성 적용
		//CustomerDAO dao = CustomerDAOImpl.getIns();
//		CustomerDAO dao = CustomerDAOImpl.getIns();
		
		//5. 회원수정 처리
		int updatecnt = dao.updatecustomer(dto);
		//6. jsp로 처리결과 전달
		model.addAttribute("updatecnt", updatecnt);
	}
	
}
