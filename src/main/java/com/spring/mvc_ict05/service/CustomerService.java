package com.spring.mvc_ict05.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.ui.Model;

public interface CustomerService {
	//id 중복확인
	public void idconfirmaction(HttpServletRequest request, HttpServletResponse response, Model model)
			throws ServletException, IOException;
	//회원가입 처리
	public void signinaction(HttpServletRequest request, HttpServletResponse response, Model model)
			throws ServletException, IOException;
	//로그인처리, 회원정보 인증(수정, 탈퇴)
	public void loginaction(HttpServletRequest request, HttpServletResponse response, Model model)
			throws ServletException, IOException;
	//회원정보 인증 처리 및 탈퇴
	public void deletecustomeraction(HttpServletRequest request, HttpServletResponse response, Model model)
			throws ServletException, IOException;
	//회원정보 인증 상세페이지 처리
	public void modifydetailaction(HttpServletRequest request, HttpServletResponse response, Model model)
			throws ServletException, IOException;
	//회원정보 수정처리
	public void modifycustomeraction(HttpServletRequest request, HttpServletResponse response, Model model)
			throws ServletException, IOException;
}
