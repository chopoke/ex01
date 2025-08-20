package com.spring.mvc_ict05.dao;

import java.util.Map;

import com.spring.mvc_ict05.dto.CustomerDTO;


public interface CustomerDAO {
	//id 중복확인
	public int useridcheck(String id);
	//회원가입 처리
	public int insertcustomer(CustomerDTO dto);
	//로그인처리, 회원정보 인증(수정, 탈퇴)
	public int idpasswordchk(Map<String, Object> map);
	//회원정보 인증 처리 및 탈퇴
	public int deletecustomer(String id);
	//회원정보 인증 상세페이지 처리
	public CustomerDTO getcustomerdetail(String id);
	//회원정보 수정처리
	public int updatecustomer(CustomerDTO dto);
}
