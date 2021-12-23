package kr.co.softsoldesk.controller;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import kr.co.softsoldesk.beans.DataBean1;

@Controller
public class TestController {
	
	@Autowired
	ServletContext application;
	
	/*@GetMapping("/test1")
	public String test1(HttpServletRequest request ){
		
		//모든 브라우저에서 같은 메모리 공간을 사용 
		ServletContext application = request.getServletContext();
		application.setAttribute("data1", "문자1");
		
		return "test1";
	}*/
	
	//Autowired썼을때 
	/*@GetMapping("/test1")
	public String test1(){
		application.setAttribute("data1", "문자1");
		
		return "test1";
	}*/
	
	// Bean 쓸때 
	@GetMapping("/test1")
	public String test1(){
		DataBean1 bean1 = new DataBean1();
		bean1.setData1("문자1");
		bean1.setData2("문자2");
		application.setAttribute("bean1", bean1);
		
		return "test1";
	}
	
	/*@GetMapping("/result1")
	public String result1(HttpServletRequest request){
		ServletContext application=request.getServletContext();
		String data1=(String)application.getAttribute("data1");
		
		return "result1";
	}*/
	
	//Autowired썼을때 
	/*@GetMapping("/result1")
	public String result1(HttpServletRequest request){
		String data1=(String)application.getAttribute("data1");
		
		return "result1";
	}*/
	
	//bean 쓸때 
	@GetMapping("/result1")
	public String result1(HttpServletRequest request){
		DataBean1 bean1=(DataBean1)application.getAttribute("bean1");
		
		System.out.println("bean1.data1 : "+ bean1.getData1());
		System.out.println("bean1.data2 : "+ bean1.getData2());
		
		return "result1";
	}
	
}
