package kr.co.softsoldesk.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
	
	@GetMapping("/test1")
	public String test1(Model model) {
		
		int[] array1= {10,20,30};
		//model.addAttribute("array1", array1[0]);
		//model.addAttribute("array1", array1[10]); //없는 값으로 오류 발생시켜보기 
		
		ArrayList<String> list = null; //이 부분에 대한 익셉션을 또 만들어야 하니까 서블릿에 글로벌(전역변수)로 올려놓고 다 같이 잡을 수 있음 
		list.add("문자열1");
		
		return "test1";
	}
	
	//try/catch의 역할을 ExceptionHandler 어노테이션으로 처리 
	//out of bounds 익센셥 처리하는 메소드 (익센션코드를 알아야함. 매개변수에 넣어야하니까 ) 
	@ExceptionHandler(ArrayIndexOutOfBoundsException.class)
	public String exception1() {
		return "error1";
	}
	
	
}
