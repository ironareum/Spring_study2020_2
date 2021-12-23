package kr.co.softsoldesk.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {
	
	@GetMapping("/test1")
	public String test1() {
		return "test1";
	}
	
	@GetMapping("/test2")
	public String test2(HttpServletRequest request) {
		//데이터 담기 
		//HttpServletRequest의 setAttribute로 등록하고 getAttribute로 jsp에 전달함 
		request.setAttribute("data1", 300);
		request.setAttribute("data2", 400);
		
		return "test2";
	}
	
	@GetMapping("/test3")
	public String test3(Model model) {
		//Model객체로 등록시 HttpServletRequest객체에 담겨서 jsp로 전달됨 : ModelAndView 
		//*값이 넘어오는데 뷰에서 안보이는현상 : 리졸브가 막혔다고 한다고함...
		model.addAttribute("data1", 300);
		model.addAttribute("data2", 400); //받을때 스코프로 받음 
		
		return "test3"; //Resolver
	}
	
	@GetMapping("/test4")
	public ModelAndView test4(ModelAndView mv) {
		//ModelAndView 객체로 등록시 HttpServletRequest객체에 담겨서 jsp로 전달됨 : ModelAndView 
		mv.addObject("data1", 500);
		mv.addObject("data2", 600);
		//ViewName 지정 
		mv.setViewName("test4"); //넘겨줄 뷰 파일명 
		
		return mv; //Resolver (객체 자체가 넘어감) 
	}
}
