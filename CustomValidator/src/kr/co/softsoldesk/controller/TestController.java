package kr.co.softsoldesk.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;

import kr.co.softsoldesk.beans.DataBean1;
import kr.co.softsoldesk.validator.DataBean1Validator;

@Controller
public class TestController {
	
	@GetMapping("/input_data")
	public String input_data(DataBean1 databean1) {
		return "input_data";
	}
	
	@PostMapping("/input_pro")
	public String input_pro(@Valid DataBean1 databean1, BindingResult result) {
		
		if(result.hasErrors()) {
			return "input_data";
		}
		return "input_success";
	}
	
	@InitBinder
	public void InitBinder(WebDataBinder binder) {
		DataBean1Validator validator1 = new DataBean1Validator();
		//binder.setValidator(validator1); //하나일때 
		binder.addValidators(validator1); //여러개일때 , 넣고 표시 
	}
	
}
