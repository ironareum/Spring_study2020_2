package kr.co.softsoldesk.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import kr.co.softsoldesk.beans.DataBean;

@Controller
public class TestController {
	
	@GetMapping("/test1")
	public String test1(DataBean bean) {
		//bean에 값 넣기 
		bean.setA1("Hello");
		bean.setA2("백설");
		bean.setA3("1234");
		bean.setA4("종로구");
		
		/*List<String> list = null;
		list.add("가");
		list.add("나");
		bean.setA5(list);*/
		
		return "test1";
	}
		
}
