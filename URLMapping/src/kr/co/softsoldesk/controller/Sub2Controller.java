package kr.co.softsoldesk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/sub2") //하위경로 통합. 앞에 sub2로 들어오면 일단 다 이쪽으로 옴. 이후 세부경로 아래의 메소드로 나눠줌 
public class Sub2Controller {
	
	@RequestMapping(value="/test5", method= RequestMethod.GET) //url주소에서 받아온 값 
	public String test5() {
		return "/sub2/test5"; //가라고 할 뷰 jsp 파일 위치 
	}
	
	@RequestMapping(value="/test6", method= RequestMethod.GET)
	public String test6() {
		return "/sub2/test6";
	}
}
