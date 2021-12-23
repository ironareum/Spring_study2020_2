package kr.co.softsoldesk.controller;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import kr.co.softsoldesk.beans.DataBean1;
import kr.co.softsoldesk.beans.DataBean2;
import kr.co.softsoldesk.beans.DataBean3;
import kr.co.softsoldesk.beans.DataBean4;

@Controller
public class TestController {
	
	//RootAppContext에서 정의한 DataBean1의 주입(type 방법)
	//@RequestScope로 정의되어 있으므로 새로운 요청이 발생했을때 객체가 생성됨 
	@Autowired
	DataBean1 requestBean1;
	
	//이름으로 주입시 이름으로 선언 
	@Resource(name="requestBean2")
	DataBean2 requestBean2;
	
	//DataBean3,4는 컴포넌트처리해서 서블릿컨텍스트에 올려둠 (루트앱컨텍스트에 빈처리 안함) 
	@Autowired
	DataBean3 requestBean3;
	
	@Resource(name="requestBean4")
	DataBean4 requestBean4;
	
	@GetMapping("/test1")
	public String test1() { //매개변수에 @ModelAttribue DataBean1 한것과 동일. 
		requestBean1.setData1("문자열1");
		requestBean1.setData2("문자열2");
		
		requestBean2.setData1("문자열3");
		requestBean2.setData2("문자열4");
		
		requestBean3.setData1("문자열5");
		requestBean3.setData2("문자열6");

		requestBean4.setData1("문자열7");
		requestBean4.setData2("문자열8");
		return "forward:/result1"; //새로운 요청이 발생되는 것이 아니므로 DataBean1의 주입이 발생하지 않음 
	}
	
	
	/*@GetMapping("/result1") //jsp까지 값을 저장하여 전달하려면 새로운 요청이 발생되어야 함 
	public String result1() {
		System.out.println("data1: "+requestBean1.getData1());
		System.out.println("data2: "+requestBean1.getData2());
		return "result1"; //jsp까지 전달될 값이 없음 
	}*/
	
	/*	@GetMapping("/result1") 
		public String result1(HttpServletRequest request) {
			String data1=requestBean1.getData1();
			String data2=requestBean1.getData2();
			System.out.println("data1: "+data1);
			System.out.println("data2: "+data2);
			
			request.setAttribute("data1", data1);
			return "result1"; 
		}
		
	*/	//Model model을 사용하면 새로운 주입이 발생되므로 jsp까지 값이 전달됨 
	@GetMapping("/result1")  
	public String result1(Model model) {
		System.out.println("requestBean1.data1: "+requestBean1.getData1());
		System.out.println("requestBean1.data2: "+requestBean1.getData2());
		
		System.out.println("requestBean2.data1: "+requestBean2.getData1());
		System.out.println("requestBean2.data2: "+requestBean2.getData2());

		System.out.println("requestBean3.data1: "+requestBean3.getData1());
		System.out.println("requestBean3.data2: "+requestBean3.getData2());

		System.out.println("requestBean4.data1: "+requestBean4.getData1());
		System.out.println("requestBean4.data2: "+requestBean4.getData2());
		
		model.addAttribute("requestBean1",requestBean1);
		model.addAttribute("requestBean2",requestBean2);
		model.addAttribute("requestBean3",requestBean3);
		model.addAttribute("requestBean4",requestBean4);
	
		return "result1"; 
	}
	
	
	
}
