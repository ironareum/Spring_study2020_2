package kr.co.softsoldesk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
	
	@GetMapping("/test1")
	public String test1() {
//		return "test1";
		return "redirect:/sub1"; //컨트롤러 안에서 sub1을 찾음 (아래메소드에 도착) 
	}
	
	@GetMapping("/sub1")
	public String sub1() {
		return "sub1";
	}

	@GetMapping("/test2")
	public String test2() {
		return "forward:/sub2";
	}
	
	
	@GetMapping("/sub2")
	public String sub2() {
		return "sub2";
	}
	
}
