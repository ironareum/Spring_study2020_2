package kr.co.softsoldesk.controller;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import kr.co.softsoldesk.beans.DataBean;
import kr.co.softsoldesk.beans.DataBean2;

@Controller
public class TestController {
	
	//동일한 이름의 데이터가 2개이상 존재할시 map에서는 첫번째값만 사용할 수 있음 
	/*@GetMapping("/test1")
	public String test1(@RequestParam Map<String, String> map) {
		String data1= map.get("data1");
		String data2= map.get("data2");
		String data3= map.get("data3");
		
		System.out.println("data1 : "+ data1);
		System.out.println("data2 : "+ data2);
		System.out.println("data3 : "+ data3);
		
		return "result";
	}*/
	
	//동일한 이름의 데이터가 2개이상 존재할 시 List<String> 사용 
	@GetMapping("/test1")
	public String test1(@RequestParam Map<String, String> map, @RequestParam List<String> data3) {
		String data1= map.get("data1");
		String data2= map.get("data2");
		String data33= map.get("data33");
		
		System.out.println("data1 : "+ data1);
		System.out.println("data2 : "+ data2);
		System.out.println("data3 : "+ data33);
		
		for(String s : data3) {
			System.out.println("str : "+s);
		}
		
		return "result";
	} //타입 Integer로 바꾸면 500번 에러 뜸. 
	
	
	//타입 변환 에러 
	/*@GetMapping("/test1")
	public String test1(@RequestParam Map<Integer, Integer> map, @RequestParam List<Integer> data3) {
		int data1= (int)map.get("data1");
		int data2= (int)map.get("data2");
		int data33= (int)map.get("data3");
		
		System.out.println("data1 : "+ data1);
		System.out.println("data2 : "+ data2);
		System.out.println("data3 : "+ data33);
		
		for(int s : data3) {
			System.out.println("str : "+s);
		}
		
		return "result";
	}*/
	
	//=========================================================
	
	/*//객체(여기서는 DataBean)을 가져와서 활용하는 방법 
	@GetMapping("/test2") //data1=100, data2=200, data3[]=300,400 속성명 반드시 동일! 
	public String test2(@ModelAttribute DataBean bean1) { //주입완료 됨 (일치되는 속성값 있으면 set완료) 
		
		System.out.printf("data1 : %d\n", bean1.getData1());
		System.out.printf("data2 : %d\n", bean1.getData2());
		
		for(int i: bean1.getData3()) {
			System.out.printf("data3 : %d\n", i);
		}
		
		return "result";
	}*/
	
	
	//=========================================================
	/*@GetMapping("/test2") //100 200 300 400 
	public String test2(@ModelAttribute DataBean bean1, DataBean2 bean2) { //같은값 객체 여러곳에 사용 & 동시주입 가능 
		//bean1
		System.out.printf("bean1.data1 : %d\n", bean1.getData1());
		System.out.printf("bean1.data2 : %d\n", bean1.getData2());
		
		for(int i: bean1.getData3()) {
			System.out.printf("bean1.data3 : %d\n", i);
		}
		System.out.println();
		
		//bean2
		System.out.printf("bean2.data1 : %d\n", bean2.getData1());
		System.out.printf("bean2.data2 : %d\n", bean2.getData2());
		
		return "result";
	}*/
	
	//
	@GetMapping("/test2") //@ModelAttribute 생략가능 
	public String test2(DataBean bean1, DataBean2 bean2) {  
		//bean1
		System.out.printf("bean1.data1 : %d\n", bean1.getData1());
		System.out.printf("bean1.data2 : %d\n", bean1.getData2());
		
		for(int i: bean1.getData3()) {
			System.out.printf("bean1.data3 : %d\n", i);
		}
		System.out.println();
		
		//bean2
		System.out.printf("bean2.data1 : %d\n", bean2.getData1());
		System.out.printf("bean2.data2 : %d\n", bean2.getData2());
		
		return "result";
	}
	
}
