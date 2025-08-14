package com.spring.mvc_ict05;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class test_controller {
	private static final Logger logger = LoggerFactory.getLogger(test_controller.class);
		
		
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
	
	@RequestMapping("shop_main")
	public String shop_main() {
		logger.info("=== url -> test1 ===");
		
		return "shop_main";
	}
}
