package kr.co.softsoldesk.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//@PropertySource("/WEB-INF/properties/data1.properties") //단일파일로 설정하는 방법 
/*@PropertySources({@PropertySource("/WEB-INF/properties/data1.properties"), //복수설정방법1
	@PropertySource("/WEB-INF/properties/data2.properties")})*/


@Controller
@PropertySource(value = {"/WEB-INF/properties/data1.properties", "/WEB-INF/properties/data2.properties"})
public class TestController {
	@Value("${aaa.a1}")
	private int a1;
	
	@Value("${aaa.a2}")
	private String a2;
	
	@Value("${bbb.b1}")
	private int b1;
	
	@Value("${bbb.b2}")
	private String b2;

	@Value("${ccc.c1}")
	private int c1;
	
	@Value("${ccc.c2}")
	private String c2;
	
	@Value("${ddd.d1}")
	private int d1;
	
	@Value("${ddd.d2}")
	private String d2;
	
	@GetMapping("/test1")
	public String test1() {
		
		System.out.println("aaa.a1: "+a1);
		System.out.println("aaa.a2: "+a2);
		System.out.println("bbb.b1: "+b1);
		System.out.println("bbb.b2: "+b2);
		System.out.println("ccc.c1: "+c1);
		System.out.println("ccc.c2: "+c2);
		System.out.println("ccc.d1: "+d1);
		System.out.println("ccc.d2: "+d2);
		return "test1";
	}
}
