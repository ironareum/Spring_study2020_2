package kr.co.softsoldesk.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.servlet.ModelAndView;

import kr.co.softsoldesk.beans.DataBean;

@Controller
public class TestController {
	
	@GetMapping("/test1")
	public String test1(HttpServletRequest request) {
		request.setAttribute("data1", "문자열1");
		return "forward:/result1";
	}
	
	
	@GetMapping("/result1")
	public String result1(HttpServletRequest request) {
		String data11 =(String)request.getAttribute("data1");
		System.out.printf("data1 : %s\n", data11);
		return "result1";
	}
	
	
	//================================================
	@GetMapping("/test2")
	public String test2(Model model) {
		model.addAttribute("data2", "문자열2");
		return "forward:/result2";
	}
	
	/*@GetMapping("/result2")
	public String result2(Model model) {
		String data_model2=(String)model.getAttribute("data2");
		System.out.println(data_model2);
		return "result2"; //null 각각 모델에 따로 주입받기때문 
	}*/
	
	@GetMapping("/result2")
	public String result2(HttpServletRequest request) {
		String data22=(String)request.getAttribute("data2");
		System.out.println("data22: "+data22);
		return "result2";
	}
	
	//===============================================
	//test3 -> ModelAndView (viewname)
	
	@GetMapping("/test3")
	public ModelAndView test3(ModelAndView mv) {
		mv.addObject("data3", "data3");
		mv.setViewName("forward:/result3");
		return mv;
	}
	
	@GetMapping("/result3")
	public String result3(HttpServletRequest request) {
		String data3 = (String)request.getAttribute("data3");
		System.out.println("mv: "+data3);
		return "result3";
	}
	
	//===============================================
	//test4 -> DataBean의 객체 자동주입 
	//Model 로 받기 
	@GetMapping("/test4")
	public String test4( Model model) {
		DataBean bean = new DataBean();
		bean.setData1("data1");
		bean.setData2("data2");
		model.addAttribute("bean1",bean);
		
		return "forward:/result4"; //Data가 유지되면서 넘어감 
	}
	
	@GetMapping("/result4")
	public String result4(HttpServletRequest request) {
		DataBean bean1=(DataBean)request.getAttribute("bean1");
		System.out.println("data11: "+bean1.getData1());
		System.out.println("data22: "+bean1.getData2());
		
		return "result4";
	}
	
	
	//=================================================
	//DataBean bean1 자동주입인데 지정한 이름으로 받음 
	@GetMapping("/test5")
	public String test5(@ModelAttribute("bean1") DataBean bean) {
		bean.setData1("data1");
		bean.setData2("data2");
		
		return "forward:/result5"; //Data가 유지되면서 넘어감 
	}
	
	@GetMapping("/result5")
	public String result5(HttpServletRequest request) {
		DataBean bean1=(DataBean)request.getAttribute("bean1");
		System.out.println("data11: "+bean1.getData1());
		System.out.println("data22: "+bean1.getData2());
		
		return "result5";
	}
	
}
