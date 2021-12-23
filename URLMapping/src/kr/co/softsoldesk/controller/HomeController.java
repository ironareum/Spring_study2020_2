package kr.co.softsoldesk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class HomeController {
	//클라이언트가 어디서든 주소를 요청하면 home()을 호출함. 
	//서블릿에서 주소값 주는것처럼 강제로 준다고함...? 
	@RequestMapping(value="/", method=RequestMethod.GET) //주소를 입력하면 어디에서든 얘를 실행되게끔. / <- 루트아래.  
	public String home() {
		System.out.println("home");
		//return "/WEB-INF/views/index.jsp";
		return "index";
}
	}
