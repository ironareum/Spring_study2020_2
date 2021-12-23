package kr.co.softsoldesk.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import kr.co.softsoldesk.beans.DataBean1;

@Controller
@SessionAttributes({"sessionBean1", "sessionBean2"}) //들어오자마자 sessionBean1을 찾음 
public class TestController {
	
	@ModelAttribute("sessionBean1")
	public DataBean1 sessionBean1() {
		return new DataBean1();
	}
	
	@ModelAttribute("sessionBean2")
	public DataBean1 sessionBean2() {
		return new DataBean1();
	}
	
	
	//Request로 받기 (로그인에 활용) 
	
	/*@GetMapping("/test1")
	public String test1(HttpServletRequest request) {
		//request에 의해 세션이 작동
		HttpSession session = request.getSession();
		session.setAttribute("data1", "문자열"); //리퀘스트 발생시 세션은 자동으로 잡힘
		
		return "test1";
	}
	
	@GetMapping("/result1")
	public String result1(HttpServletRequest request) {
		HttpSession session = request.getSession();
		String data1=(String)session.getAttribute("data1");
		System.out.println("data1 :" + data1);
		
		return "result1";
	}*/
	
	//===================================================
	//Session 으로 잡기 (OPT, 일회용인증코드에 활용)
	
	/*@GetMapping("/test1")
	public String test1(HttpSession session) {
		//리퀘스트로 받아오는 부분 지워짐 
		
		session.setAttribute("data1", "문자열"); //리퀘스트 발생시 세션은 자동으로 잡힘
		
		return "test1";
	}*/
	
	@GetMapping("/result1")
	public String result1(HttpSession session) {
		//리퀘스트로 받아오는 부분 지워짐 
		
		String data1=(String)session.getAttribute("data1");
		System.out.println("data1 :" + data1);
		
		return "result1";
	}
	
	//===================================================
	//브라우저만 유지되면 저장됨 
	//redirect
	@GetMapping("/test2")
	public String test2(HttpSession session) { 
		
		session.setAttribute("data1", "문자열2"); 
		
		return "redirect:/result1";
	}
	
	@GetMapping("/test3")
	public String test3(HttpSession session) { 
		
		session.setAttribute("data1", "문자열3"); 
		
		return "forward:/result1";
	}
	
	
	@GetMapping("/test4")
	public String test4(HttpSession session) { 
		DataBean1 bean1= new DataBean1();
		bean1.setData1("문자4");
		bean1.setData2("문자5");
		
		session.setAttribute("bean1", bean1); 
		return "test4";
	}
	
	/*@GetMapping("/result4")
	public String result4(HttpSession session) { 
		DataBean1 bean1=(DataBean1)session.getAttribute("bean1");
		System.out.println("bean1.data1 : "+bean1.getData1());
		System.out.println("bean1.data2 : "+bean1.getData2());
		
		return "result4";
	}*/
	
	//객체로 빈 가져와서 사용하는 법. (Better!) 
	@GetMapping("/result4")
	public String result4(@SessionAttribute("bean1") DataBean1 bean1) { 
		
		System.out.println("bean1.data1 : "+bean1.getData1());
		System.out.println("bean1.data2 : "+bean1.getData2());
		
		return "result4";
	}
	//================================================
	//여러곳에서 참조할때 ...? 
	@GetMapping("/test5")
	public String test5(@ModelAttribute("sessionBean1") DataBean1 sessionBean1, 
						@ModelAttribute("sessionBean2") DataBean1 sessionBean2) { 

		sessionBean1.setData1("문자6");
		sessionBean1.setData2("문자7");
		
		sessionBean2.setData1("문자8");
		sessionBean2.setData2("문자9");

		return "test5";
	}
	
	@GetMapping("/result5")
	public String result5(@ModelAttribute("sessionBean1") DataBean1 sessionBean1,
							@ModelAttribute("sessionBean2") DataBean1 sessionBean2) { 
		
		System.out.println("sessionBean1.data1 : "+sessionBean1.getData1());
		System.out.println("sessionBean1.data2 : "+sessionBean1.getData2());

		System.out.println("sessionBean2.data1 : "+sessionBean2.getData1());
		System.out.println("sessionBean2.data2 : "+sessionBean2.getData2());
		
		return "result5";
	}
}
