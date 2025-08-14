package com.spring.mvc_ict05;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


public class MyController {
	
	private static final Logger logger = LoggerFactory.getLogger(MyController.class);
	
	//http://localhost/mvc/member - > http://localhost/컨덱스트패스(즉 세번쨰 패키지명)/매핑url 
	
	//방법1. model 클래스를 이용한 데이터 전달
	@RequestMapping("member")
	public String member(Model model) {
		logger.info("=== url -> member ===");
		
		//model.addAttribute("속성키", "속성벨류")
		model.addAttribute("id", "ccy");
		model.addAttribute("password", "1234");
		model.addAttribute("name", "cho");
		model.addAttribute("email", "ccy@mail.com");
		
		
		return "test/member";	//	webapp/WEB-INF/views/ + test/member + .jsp
	}
	//방법2. modelandview 클래스를 이용한 데이터 전달
	@RequestMapping("myinfo")
	public ModelAndView myinfo() {
		logger.info("=== url -> myinfo ===");
		
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("id", "cho");
		mav.addObject("password", "4321");
		mav.addObject("name", "ccy");
		mav.addObject("email", "cho@mail.net");
		
		mav.setViewName("test/myinfo");
		
		return mav;
	}
	
	@RequestMapping("test1")
	public String test1() {
		logger.info("=== url -> test1 ===");
		
		return "test1";
	}
	/*
	   * 면접문제 : 박스채우기 - DispatcherServlet(FrontController라고도 한다.)
	   * 
	   * 1. 컨트롤러 클래스 제작
	   * 
	   * (1) 프로세스 
	   * 최초 클라이언트부터 요청이 들어왔을 때 DispatcherServlet(web.xml)을 통해 컨트롤러로 진입하게 된다.
	   * 그리고 컨트롤러는 요청에 대한 작업을 처리한 후, 뷰 쪽으로 데이터를 전달한다.
	   * 
	   * 1) web.xml -> 2) DispatcherServlet -> 
	   * 3) servlet-context.xml(component-scan) : 3-1) @Contoller -> 3-2) @Service -> 3-3) @Repository
	   *    : 컨테이너가 base-package에 있는 클래스들을 자동으로 객체 생성(단 클래스들은 @Component 지정)
	   * 4) servlet-context.xml(ViewResolver) -> View(jsp)
	   *                       
	   * - DispatcherServlet : 유일한 서블릿 클래스로서 모든 클라이언트의 요청을 가장 먼저 처리하는 Front Controller
	   * - HandlerMapping : 클라이언트의 요청을 처리한 Contoller들의 매핑이며, 스프링에서는 @RequestMapping을 이용하여 HandlerMapping 설정을 대체한다.
	   * - Controller : 실질적인 클라이언트의 요청 처리
	   * - ViewResolver : Controller가 리턴한 View 이름이며, 실행될 JSP 경로를 완성
	   * 
	   * (2) 컨트롤러 클래스 제작 순서
	   * ㄱ. @Controller를 이용한 클래스 생성
	   * ㄴ. @RequestMapping을 이용한 요청경로 지정
	   * ㄷ. 서비스 호출
	   * ㄹ. 뷰이름 리턴
	   * 
	   * 2. 서비스 클래스 제작
	   *    클라이언트의 요청처리 메서드 구현(비즈니스 로직 구현)
	   * 
	   * 3. 뷰에 데이터를 전달
	   *    서비스에서 로직을 수행한 후 뷰페이지로 반환한다.
	   *    이 때 뷰에서 사용하게 될 데이터를 객체로 전달(=model)할 수 있다.
	   * -> JSP에서 EL태그(${key})로 값을 전달받는다.
	   *
	   * 방법1. Model 클래스를 이용한 데이터 전달
	   * 방법2. ModelAndView 클래스를 이용한 데이터 전달
	   */
}
