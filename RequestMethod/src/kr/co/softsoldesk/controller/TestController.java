package kr.co.softsoldesk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {
	
	@RequestMapping(value="/test1", method=RequestMethod.GET)
	public String test1_get() {
		return "test1";
	}
	
	@RequestMapping(value="/test2", method=RequestMethod.POST)
	public String test2_get() {
		return "test2";
	}
	
	//===========================================================
	// get, post 두가지 방식(=다른 처리방식)으로 받을때 jsp 따로따로 분리하여 만들어줌 
	@RequestMapping(value="/test3", method=RequestMethod.GET)
	public String test3_get() {
		return "test3_get";
	}
	@RequestMapping(value="/test3", method=RequestMethod.POST)
	public String test3_post() {
		return "test3_post";
	}
	
	//===========================================================
	//method를 어노테이션에 이미 Get으로 명시해서 ()안에 따로 메소드 명시해줄 필요 없음
	//위의 방식보다 요게 사용하기 훨씬 간편함.
	@GetMapping("/test4")
	public String test4() {
		return "test4";
	}
	
	@PostMapping("/test5")
	public String test5() {
		return "test5";
	}
	
	//===========================================================
	@GetMapping("/test6")
	public String test6_get() {
		return "test6_get";
	}
	
	@PostMapping("/test6")
	public String test6_post() {
		return "test6_post";
	}
	//===========================================================
	//메소드별로 구분하지 않고 2개를 동일하게 처리하는 방법 (=같은 뷰단)
	@RequestMapping(value="/test7", method= {RequestMethod.POST, RequestMethod.GET})
	public String test7() {
		return "test7";
	}
	
	//===========================================================
	//얘는 같은곳으로 갈때도 각각 메소드를 따로 명시해줘야함. 리턴값은 동일하게 가능. 
	@GetMapping("/test8")
	public String test8_get() {
		return "test8";
	}
	@PostMapping("/test8")
	public String test8_post() {
		return "test8";
	}


}
