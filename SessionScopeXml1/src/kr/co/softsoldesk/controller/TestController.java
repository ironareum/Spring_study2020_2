package kr.co.softsoldesk.controller;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import kr.co.softsoldesk.beans.DataBean1;
import kr.co.softsoldesk.beans.DataBean2;
import kr.co.softsoldesk.beans.DataBean3;
import kr.co.softsoldesk.beans.DataBean4;

@Controller
public class TestController {
	
	@Autowired
	@Lazy
	DataBean1 sessionBean1;
	
	@Resource(name="sessionBean2")
	@Lazy
	DataBean2 sessionBean2;
	
	@Autowired
	@Lazy
	DataBean3 sessionBean3;
	
	@Resource(name="sessionBean4")
	@Lazy
	DataBean4 sessionBean4;
	
	@GetMapping("/test1")
	public String test1() {
		
		sessionBean1.setData1("data1");
		sessionBean1.setData2("data2");
		
		sessionBean2.setData3("data3");
		sessionBean2.setData4("data4");

		sessionBean3.setData5("data5");
		sessionBean3.setData6("data6");

		sessionBean4.setData7("data7");
		sessionBean4.setData8("data8");
		
		return "test1";
	}
	
	@GetMapping("/result1")
	public String result1(Model model) {
		
		System.out.println("sessionBean1.getData1: "+ sessionBean1.getData1());
		System.out.println("sessionBean1.getData2: "+ sessionBean1.getData2());
		
		System.out.println("sessionBean2.getData3: "+ sessionBean2.getData3());
		System.out.println("sessionBean2.getData4: "+ sessionBean2.getData4());	
		
		System.out.println("sessionBean3.getData5: "+ sessionBean3.getData5());
		System.out.println("sessionBean3.getData6: "+ sessionBean3.getData6());	
		
		System.out.println("sessionBean4.getData3: "+ sessionBean4.getData7());
		System.out.println("sessionBean4.getData4: "+ sessionBean4.getData8());	
		
		model.addAttribute("bean1", sessionBean1);
//		model.addAttribute("bean2", sessionBean2);
		model.addAttribute("bean3", sessionBean3);
		model.addAttribute("bean4", sessionBean4);
		
		
		return "result1";
	}
	
	
	
}
