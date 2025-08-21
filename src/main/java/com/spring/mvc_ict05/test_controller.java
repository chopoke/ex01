package com.spring.mvc_ict05;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spring.mvc_ict05.service.CustomerServiceImpl;


@Controller
public class test_controller {
	private static final Logger logger = LoggerFactory.getLogger(test_controller.class);
		
	@Autowired
	private CustomerServiceImpl customerservice;
	
	@RequestMapping("main")
	public String main() {
		logger.info("=== url -> test1 ===");
		
		return "main";
	}
	
	@RequestMapping("yak")
	public String yak() {
		logger.info("=== url -> test1 ===");
		
		return "yak";
	}
	
	@RequestMapping("join")
	public String join() {
		logger.info("=== url -> test1 ===");
		
		return "join";
	}
	
	@RequestMapping("pet")
	public String pet() {
		logger.info("=== url -> test1 ===");
		
		return "pet";
	}
	
	@RequestMapping("joinfin")
	public String joinfin() {
		logger.info("=== url -> test1 ===");
		
		return "joinfin";
	}
	
	@RequestMapping("login")
	public String login() {
		logger.info("=== url -> test1 ===");
		
		return "login";
	}
	
	@RequestMapping("logout")
	public String logout(HttpServletRequest request) {
	    HttpSession session = request.getSession(false);
	    if (session != null) {
	        session.invalidate();
	    }
	    return "main";
	}
	
	//로그인 처리 페이지
	@RequestMapping("loginaction")
	public String loginaction(HttpServletRequest request, HttpServletResponse response, Model model) 
			throws ServletException, IOException {
		logger.info("=== url -> /loginaction.do ===");
		String id = (String)request.getSession().getAttribute("sessionid");
		if(id == null) {
			customerservice.loginaction(request, response, model);
			
		}
		return "loginaction";
	}
	
	@RequestMapping("shop_main")
	public String shop_main() {
		logger.info("=== url -> test1 ===");
		
		return "shop_main";
	}
	
	@RequestMapping("shop_detail")
	public String shop_detail() {
		logger.info("=== url -> test1 ===");
		
		return "shop_detail";
	}
	
	@RequestMapping("shop_jang")
	public String shop_jang() {
		logger.info("=== url -> test1 ===");
		
		return "shop_jang";
	}
	
	@RequestMapping("shop_pay")
	public String shop_pay() {
		logger.info("=== url -> test1 ===");
		
		return "shop_pay";
	}
	
	@RequestMapping("shop_fin")
	public String shop_fin() {
		logger.info("=== url -> test1 ===");
		
		return "shop_fin";
	}
	
	@RequestMapping("board_main")
	public String board_main() {
		logger.info("=== url -> test1 ===");
		
		return "board_main";
	}
	
	@RequestMapping("board_detail")
	public String board_detail() {
		logger.info("=== url -> test1 ===");
		
		return "board_detail";
	}
	
	@RequestMapping("board_detail2")
	public String board_detail2() {
		logger.info("=== url -> test1 ===");
		
		return "board_detail2";
	}
	
	@RequestMapping("mypage")
	public String mypage() {
		logger.info("=== url -> test1 ===");
		
		return "mypage";
	}
}
