package com.spring.mvc_ict05.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.mvc_ict05.dto.CustomerDTO;


@Repository
public class CustomerDAOImpl implements CustomerDAO {
	//커넥션 풀 객체를 보관
//	DataSource datasource = null;
	//싱글톤 객체 생성 -> @Repository -> @AUtowired
//	private static CustomerDAOImpl ins = new CustomerDAOImpl();
//	
//	public static CustomerDAOImpl getIns() {
//		if(ins == null) {
//			ins = new CustomerDAOImpl();
//		}
//		return ins;
//	}
	//디폴트 생성자
	//디폴트 생성자
	//커넥션풀(DBCP : data base connection pool)방식 - context.xml에 설정
//	private CustomerDAOImpl() {
//		try {
//			Context context = new InitialContext();
//			datasource = (DataSource)context.lookup("java:comp/env/jdbc/jsp_pj_ict05");
//		} catch (NamingException e) {
//			e.printStackTrace();
//		}
//	}
	// Mybatis jar 파일들이 pom.xml에 등록되어 있어야 SqlSession이 import 가능
	// dataSource-config.xml에 bean id="sqlSession"로 설정되어 있어야 함
	//커넥션풀(context.xml에 설정)방식 - 마이바티스 경로 -> dataSource-config.xml에서 구현
	@Autowired
	private SqlSession sqlSession;
	
//	<!-- 커넥션풀(DBCP: DataBase Connection Pool 방식) => Servers > Tomcat > context.xml
//		       => 톰캣 재설치시 추가해야 하며, 안하면 DB연결이 안된다.
//				name이 식별자 이므로 중복되면 안되고ㅡ lookup을 통해 검색한다.
//		     -->
//		     
//		     <Resource
//		     	author="Container"
//		     	name="jdbc/jsp_pj_ict05" 팀작업시 중복안됨
//		     	type="javax.sql.DataSource"
//		     	driverClassName="oracle.jdbc.driver.OracleDriver"
//		     	url="jdbc:oracle:thin:@localhost:1521/xe"
//		     	username="jsp_pj_ict05"
//		     	password="tiger"
//		     	maxActive="8"
//		     	maxWait="1000"
//		     />
	
	
	//id 중복확인
	@Override
	public int useridcheck(String id) {
		System.out.println("CustomerDAOImpl - useridcheck");
//		Connection conn =null;
//		PreparedStatement pstmt = null;
//		ResultSet rs = null;
		int ckid = sqlSession.selectOne("spring.mvc.spring_pj_ict05.dao.CustomerDAO.useridcheck", id);
		
//		try {
//			conn = datasource.getConnection();
//			
//			String sql = "SELECT * FROM MVC_CUSTOMER_TBL WHERE user_id = ? ";
//			
//			pstmt = conn.prepareStatement(sql);
//			pstmt.setString(1, id);
//			
//			rs = pstmt.executeQuery();
//			
//			if(rs.next()) {
//				ckid = 1;
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				if(pstmt != null) {
//					pstmt.close();
//				}
//				if(conn != null) {
//					conn.close();
//				}
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//		}
		
		return ckid;
	}
	//회원가입 처리
	@Override
	public int insertcustomer(CustomerDTO dto) {
		System.out.println("CustomerDAOImpl - insertcustomer");
		
//		Connection conn = null;
//		PreparedStatement pstmt = null;
		int insertcnt = sqlSession.insert("spring.mvc.spring_pj_ict05.dao.CustomerDAO.insertcustomer", dto);
		
//		try {
//			//1. db연결 -> 데이터베이스 커넥션 생성
//			conn = datasource.getConnection();
//			//2. SQL작성 -> PrepareStatement 작성
//			String sql = "INSERT INTO MVC_CUSTOMER_TBL(user_id, user_password, user_name, user_birthday, user_address, user_hp, user_email, user_regdate) "
//					+ "		VALUES 						( ?, ?, ?, ?, ?, ?, ?, ?)";
//			//3. 실행
//			pstmt = conn.prepareStatement(sql);
//			pstmt.setString(1, dto.getUser_id());
//			pstmt.setString(2, dto.getUser_password());
//			pstmt.setString(3, dto.getUser_name());
//			pstmt.setDate(4, dto.getUser_birthday());
//			pstmt.setString(5, dto.getUser_address());
//			pstmt.setString(6, dto.getUser_hp());
//			pstmt.setString(7, dto.getUser_email());
//			pstmt.setTimestamp(8, dto.getUser_regdate());
//			
//			insertcnt = pstmt.executeUpdate();
//			
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				if(pstmt != null) {
//					pstmt.close();
//				}
//				if(conn != null) {
//					conn.close();
//				}
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//		}
		return insertcnt;
	}
	//로그인처리, 회원정보 인증(수정, 탈퇴)
	@Override
	public int idpasswordchk(Map<String, Object> map) {
		System.out.println("CustomerDAOImpl - idpasswordchk");
		
//		Connection conn = null;
//		PreparedStatement pstmt = null;
//		ResultSet rs = null;
		int selcnt = sqlSession.selectOne("com.spring.mvc_ict05.dao.CustomerDAO.idpasswordchk", map);
		
//		try {
//			conn = datasource.getConnection();
//			
//			String sql = "SELECT * FROM MVC_CUSTOMER_TBL WHERE user_id = ? AND user_password = ? ";
//			
//			pstmt = conn.prepareStatement(sql);
//			pstmt.setString(1, id);
//			pstmt.setString(2, pw);
//			
//			rs = pstmt.executeQuery();
//			
//			if(rs.next()) {
//				selcnt = 1;
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				if(pstmt != null) {
//					pstmt.close();
//				}
//				if(conn != null) {
//					conn.close();
//				}
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//		}
		return selcnt;
	}
	//회원정보 인증 처리 및 탈퇴
	@Override
	public int deletecustomer(String id) {
		System.out.println("CustomerDAOImpl - deletecustomer");
		
		int delcnt = sqlSession.delete("spring.mvc.spring_pj_ict05.dao.CustomerDAO.deletecustomer", id);
//		Connection conn = null;
//		PreparedStatement pstmt = null;
		
//		try {
//			conn = datasource.getConnection();
//			
//			String sql = "DELETE MVC_CUSTOMER_TBL WHERE user_id = ? ";
//			
//			pstmt = conn.prepareStatement(sql);
//			pstmt.setString(1, id);
//			
//			delcnt = pstmt.executeUpdate();
//			System.out.println(id);
//			
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				if(pstmt != null) {
//					pstmt.close();
//				}
//				if(conn != null) {
//					conn.close();
//				}
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//		}
		return delcnt;
	}
	//회원정보 인증 상세페이지 처리
	@Override
	public CustomerDTO getcustomerdetail(String id) {
		System.out.println("CustomerDAOImpl - getcustomerdetail");
		
		CustomerDTO dto = sqlSession.selectOne("spring.mvc.spring_pj_ict05.dao.CustomerDAO.getcustomerdetail", id);
//		CustomerDTO dto = new CustomerDTO();
//		Connection conn = null;
//		PreparedStatement pstmt = null;
//		ResultSet rs = null;
		
//		try {
//			conn = datasource.getConnection();
//			
//			String sql = "SELECT * FROM MVC_CUSTOMER_TBL WHERE user_id = ? ";
//			
//			pstmt = conn.prepareStatement(sql);
//			pstmt.setString(1, id);
//			
//			rs = pstmt.executeQuery();
//			
//			if(rs.next()) {
//				dto.setUser_id(id);
//				dto.setUser_password(rs.getString("user_password"));
//				dto.setUser_name(rs.getString("user_name"));
//				dto.setUser_birthday(rs.getDate("user_birthday"));
//				dto.setUser_address(rs.getString("user_address"));
//				dto.setUser_hp(rs.getString("user_hp"));
//				dto.setUser_email(rs.getString("user_email"));
//				dto.setUser_regdate(rs.getTimestamp("user_regdate"));
//				System.out.println(dto);
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				if(rs != null) {
//					rs.close();
//				}
//				if(pstmt != null) {
//					pstmt.close();
//				}
//				if(conn != null) {
//					conn.close();
//				}
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//		}
		return dto;
	}
	//회원정보 수정처리
	@Override
	public int updatecustomer(CustomerDTO dto) {
		System.out.println("CustomerDAOImpl - updatecustomer");
//		Connection conn = null;
//		PreparedStatement pstmt = null;
		int updatecnt = sqlSession.update("spring.mvc.spring_pj_ict05.dao.CustomerDAO.updatecustomer", dto);
		
//		try {
//			//1. db연결 -> 데이터베이스 커넥션 생성
//			conn = datasource.getConnection();
//			//2. SQL작성 -> PrepareStatement 작성
//			String sql = "UPDATE MVC_CUSTOMER_TBL "
//					+ "SET user_password = ?, user_name = ?, user_birthday = ?, user_address = ?, user_hp = ?, user_email = ? "
//					+ "WHERE user_id = ?";
//			//3. 실행
//			pstmt = conn.prepareStatement(sql);
//			pstmt.setString(1, dto.getUser_password());
//			pstmt.setString(2, dto.getUser_name());
//			pstmt.setDate(3, dto.getUser_birthday());
//			pstmt.setString(4, dto.getUser_address());
//			pstmt.setString(5, dto.getUser_hp());
//			pstmt.setString(6, dto.getUser_email());
//			pstmt.setString(7, dto.getUser_id());
//			
//			updatecnt = pstmt.executeUpdate();
//			
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				if(pstmt != null) {
//					pstmt.close();
//				}
//				if(conn != null) {
//					conn.close();
//				}
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//		}
		return updatecnt;
	}
}
