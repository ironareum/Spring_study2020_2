package kr.co.softsoldesk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {
	//이부분의 기능 (데이터베이스, 서블릿, 자료처리 등의 내용이 여기에 온다음 함께 뷰로 넘김)
	@RequestMapping(value="/test1", method = RequestMethod.GET) //들어오는 url 값이 이거일때, 
	public String test1() {
		return "test1"; // /WEB-INF/views/test1.jsp 파일로 뷰 이동 하라는 뜻. 
	}
	
	@RequestMapping(value="/test2", method = RequestMethod.GET)
	public String test2() {
		return "test2"; 
	}
	
	@RequestMapping(value="/sub1/test3", method = RequestMethod.GET)
	public String sub1Test3() {
		return "sub1/test3"; 
	}
	
	@RequestMapping(value="/sub1/test4", method = RequestMethod.GET)
	public String sub1Test4() {
		return "sub1/test4"; 
	}

}
