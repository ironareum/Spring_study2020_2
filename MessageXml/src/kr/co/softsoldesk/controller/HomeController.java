package kr.co.softsoldesk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	// "/" :주소를 입력하면 무조건 String home()을 호출하라는 의미
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		System.out.println("home");
				
		//return null;
		//return "/WEB-INF/views/index.jsp";
		return "index"; 
	}
	
}
