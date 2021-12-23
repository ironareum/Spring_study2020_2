package kr.co.softsoldesk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import kr.co.softsoldesk.beans.DataBean;

@Controller
public class TestController {
	
	/*@GetMapping("/test1")
	public String test1() {
		return "test1";
	}*/

	
	//CommandObject (회원 정보 수정시 사용) 
	@GetMapping("/test1")
	public String test1(@ModelAttribute DataBean bean) {
		bean.setUser_name("홍길동");
		bean.setUser_id("mr_hong");
		bean.setUser_pw("mr_hong1234");
		bean.setUser_postcode("1234-5678");
		bean.setUser_address1("서울시");
		bean.setUser_address2("송파구");
		return "test1";
	}
	
	//자동주입 
	@GetMapping("/test2")
	public String test2(@ModelAttribute DataBean bean) {
		bean.setUser_name("홍길동");
		bean.setUser_id("mr_hong");
		bean.setUser_pw("mr_hong1234");
		bean.setUser_postcode("1234-5678");
		bean.setUser_address1("서울시");
		bean.setUser_address2("송파구");
		return "test2";
	}
	
	//CommandObject 객체가 들어와서 주입 
	@GetMapping("/test3")		//testBean처럼 애트리뷰트명 지정할시 ModelAttribute 생략 불가  
	public String test3(@ModelAttribute("testBean") DataBean bean) { //생성된 빈에 아래의 값 넣어서 test3로 감.
		bean.setUser_name("김길동");
		bean.setUser_id("mr_hong");
		bean.setUser_pw("mr_hong1234");
		bean.setUser_postcode("1234-5678");
		bean.setUser_address1("서울시");
		bean.setUser_address2("종로구");
		return "test3"; //test3.jsp + testBean(bean)를 가져감 (Resolver)
	}
	
	@GetMapping("/test4")
	public String test4(Model model) {
		//매개변수 Model로 쓸때는 모델을 아래처럼 명시해줘야함  
		DataBean bean = new DataBean();
		
		bean.setUser_name("김길동");
		bean.setUser_id("mr_hong");
		bean.setUser_pw("mr_hong1234");
		bean.setUser_postcode("1234-5678");
		bean.setUser_address1("서울시");
		bean.setUser_address2("종로구");
		
		model.addAttribute("test_user2",bean);
		return "test4"; //test4.jsp + test_user2(bean)를 가져감 (Resolver)
	}
	
	
	//Http로 받는방법 (이렇게하면 모델주입을 직접 해야하니까 모델어트리뷰트를 쓴다!) 
	/*
	@PostMapping("/result")
	public String result(HttpServletRequest request) {
		request.setAttribute("user_name", user_name);
		return "result";
	}*/
	
	
	//모델어트리뷰트로 모델 자동주입 (빈을 끌어쓸때) 
	@PostMapping("/result")
	public String result(@ModelAttribute DataBean bean) {
		System.out.println(bean.getUser_name());
		return "result";
	}
	
	
	
	/*@PostMapping("/result")
	public String result() {
		return "result";
	}*/
	
	
	/*
	모델어트리뷰트 : 빈을 활용 
	HttpServletRequest request: 뷰단에 직접 가져와서 주입방법
	모델 : 모델링을 컨트롤러에서 직접 주입할때  
	*/
	
	
}
