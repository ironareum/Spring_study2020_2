package kr.co.softsoldesk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import kr.co.softsoldesk.beans.DataBean;

@Controller
public class TestContorller {
	
	@PostMapping("/test1") //data1: sample1, data2: sample2
	public String test1(@ModelAttribute DataBean bean) { //@ModelAttribute는 생략가능, 자동주입 
		//ModelAttribute: 객체 가져올수 있음 (이때 jsp에서 가져온 값의 변수명과 동일한 속성명이 있으면 자동주입됨)  
		
		System.out.printf("data1 : %s\n", bean.getData1());
		System.out.printf("data2 : %s\n", bean.getData2());
		
		return "test1"; //Resolver 
	}
	
	/*@PostMapping("/test2")
	public String test2(DataBean bean) {
		return "test2";
	}*/
	
	
	//클래스 이름을 지정가능 : testData
	@PostMapping("/test2")
	public String test2(@ModelAttribute("testData") DataBean bean) { 
		return "test2";
	}
	
}
