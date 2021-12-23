package kr.co.softsoldesk.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SecondController {
	
	@GetMapping("/test2")
	public String test2() {
		
		ArrayList<String> list = null;
		list.add("문자열1");
		
		return "test2";
	}
	
	//서블릿에 글로벌로 올려두었으니까 주석처리함 
	/*@ExceptionHandler(java.lang.NullPointerException.class)
	public String exception2() {
		return "error2";
	}*/
	
}
