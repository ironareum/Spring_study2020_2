package kr.co.softsoldesk.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.WebRequest;

@Controller
public class TestController {
	/*
	 HttpServletRequest : 요청 정보의 객체타입을 자동으로 맞추며 소멸될때까지 상태유지 
	 setAttribute()메소드로 등록하고 
	 getAttribute()메소드로 데이터 추출하여 view로 보냄 (보내는 방법은 다름) 
	 */
	
	@GetMapping("/test1")
	public String test1(HttpServletRequest request) {
		String data1 = request.getParameter("data1");
		String data2 = request.getParameter("data2");
		String[] data3 = request.getParameterValues("data3"); //배열로 변수방의 여러값 받기  
		
		System.out.println("data1 : "+ data1);
		System.out.println("data2 : "+ data2);
		
		for(String s : data3) {
			System.out.println("data3 : "+ s);
		}
		
		
		return "result";
	}
	
	@PostMapping("/test2")
	public String test2(HttpServletRequest request) {
		String data1 = request.getParameter("data1");
		String data2 = request.getParameter("data2");
		String[] data3 = request.getParameterValues("data3");
		
		System.out.println("data1 : "+ data1);
		System.out.println("data2 : "+ data2);
		
		//checkbox는 아무것도 선택하지 않으면 null값으로 처리됨 (500에러 발생 막기) 
		if(data3!=null) {
			for(String s: data3) {
				System.out.println("data3 : "+ s);
			}
		}
		
		return "result";
	}
	
	//포틀릿: 웹상에서 존재하는 외부라이브러리(api)에 대한것도 모두 리퀘스트로 가져옴(확장개념의 기술. 사용빈도가 높진 않음)
	/* WebRequest request : HttpServletRequest보다 추가된 기능.
	HttpServletRequest의 요청정보를 거의 대부분 그대로 갖고 있는 API로 Servlet API의 종속적이지 않은 타입
	원래는 서블릿과 포틀릿(포틀릿은 복합페이지의 컨텍스트내에 결집되기 위해 특별히 고안된 웹컴포넌트)
	환경 양쪽 모두 사용할 수 있도록 만들어진 타입이다.*/
	
	@GetMapping("/test3")
	public String test3(WebRequest request) {
		String data1 = request.getParameter("data1");
		String data2 = request.getParameter("data2");
		String[] data3 = request.getParameterValues("data3");
		
		System.out.println("data1 : "+ data1);
		System.out.println("data2 : "+ data2);

		for(String s: data3) {
			System.out.println("data3 : "+ s);
		}
		
		return "result";
	}
	//href에서 준 값에 대한 {변수방} 순서대로 들어옴  
	@GetMapping("/test4/{data1}/{data2}/{data3}")
	public String test4(@PathVariable int data1,@PathVariable int data2, @PathVariable int data3) { //형변환을 시켜서 가져옴  
		
		System.out.println("data1 : "+ data1);
		System.out.println("data2 : "+ data2);
		System.out.println("data3 : "+ data3);
		
		int sum = data1+ data2 + data3;
		System.out.println("sum : "+ sum);
		
		
		return "result";
	}
	
	@GetMapping("/test5")
	public String test5(@RequestParam int data1, @RequestParam int data2, @RequestParam int[] data3 
			) {  //@RequestParam int data4 //없는 변수 요청시 디폴트값 주거나 혹은 null로 설정해줘야함. (아니면 에러남) <-방법은 test7 참조 
		System.out.println("data1 : "+ data1);
		System.out.println("data2 : "+ data2);
		
		for(int i: data3) {
			System.out.println("data3 : "+ i);
		}
		
		return "result";
	}
	
	@GetMapping("/test6") //변수방 새로 지정시 
	public String test6(@RequestParam(value="data1") int value1, 
						@RequestParam(value="data2") int value2, 
						@RequestParam(value="data3") int[] value3) {
		System.out.println("data1 : "+ value1);
		System.out.println("data2 : "+ value2);
		
		for(int i: value3) {
			System.out.println("data3 : "+ i);
		}
		
		return "result";
	}
	
	//없는 데이터 받으려고 할때 null값 처리 방법. required=false  / 디폴트값 0. defaultValue="0"
	@GetMapping("/test7")
	public String test7(@RequestParam int data1, 
						@RequestParam(required=false) String data2, //들어오는값 없으면 null 값. 
						@RequestParam(defaultValue="0") int data3) { //들어오는값 없으면 0으로 간주 
		
		System.out.println("data1 : "+ data1);
		System.out.println("data2 : "+ data2);
		System.out.println("data3 : "+ data3);
		
		return "result";
	}
	
}
