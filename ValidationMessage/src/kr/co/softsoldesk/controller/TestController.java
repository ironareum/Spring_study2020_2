package kr.co.softsoldesk.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import kr.co.softsoldesk.beans.DataBean1;

@Controller
public class TestController {
	
	@GetMapping("/input_data")
	public String input_data(DataBean1 dataBean1) { //form:form 태그 modelAttribute="dataBean1"때문에 매개변수 넣어둠 
		return "input_data";
	}
	
	@PostMapping("/input_pro")
	public String input_pro(@Valid @ModelAttribute DataBean1 databean1, BindingResult result) { //유효성 검사 
		System.out.println("databean1: " + databean1.getData1());
		System.out.println("databean2: " + databean1.getData2());
		System.out.println("BindingResult: "+ result);

		if(result.hasErrors()) {//유효성 위배가 있다면 
			
			return "input_data";
		}
		return "input_success";
	}
	
	
}
