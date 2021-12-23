package kr.co.softsoldesk.controller;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class TestController {
	
	@Autowired
	ReloadableResourceBundleMessageSource res;
	
	@GetMapping("/test1")
	public String test1(Model model, Locale locale) {
		
		String a1=res.getMessage("aaa.a1", null, null); //null: 다국어 처리시 
		String b1=res.getMessage("bbb.b1", null, null);
		
		//null 값 처리 : { }값을 세팅
		Object[] args= {30, "홍길동"};
		String a2 = res.getMessage("aaa.a2", args, null);
		String a3 = res.getMessage("aaa.a3", null, locale); //locale : 다국어 처리 (브라우저 환경설정에 따라 언어표현) 
		//a3은 setvlet에 등록하지 않아도 끌어올 수 있음... 왜?? 
		
		System.out.println("aaa.a1: "+ a1);
		System.out.println("bbb.b1: "+ b1);
		//args값 대입 
		System.out.println("aaa.a2: "+ a2);
		//locale
		System.out.println("locale: "+ locale);
		
		//웹에 넘길때 모델로 처리
		model.addAttribute("args",args);
		
		return "test1";
	}
}
