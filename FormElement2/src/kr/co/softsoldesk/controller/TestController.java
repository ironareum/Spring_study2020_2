package kr.co.softsoldesk.controller;

import java.util.ArrayList;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import kr.co.softsoldesk.beans.DataBean;
import kr.co.softsoldesk.beans.KeyValueBean;

@Controller
public class TestController {
	
	@GetMapping("/test1")
	public String test1(DataBean bean, Model model, Model model1, Model model2) { 
		//DAO, 오라클에서 끌어서 넘겨주는 값 (지금은 일단 직접 주입..연결 안해서) 
		//* 값 따로 줄때 많이 쓰임 
		bean.setA1("data2");
		bean.setA2("data2");
		bean.setA3("data2");
		bean.setA4("data2");
		
		String[] cehck_list = {"data1", "data3"};
		//각 배열방에 data1, data2 주입 
		bean.setA5(cehck_list);
		bean.setA6(cehck_list);
		bean.setA7(cehck_list);
		bean.setA8(cehck_list);
		
		bean.setA9("data3");
		bean.setA10("data3");
		bean.setA11("data3");
		bean.setA12("data3");
		
//----------배열-----------
		String[] data_list1= {"data1", "data2", "data3"};  
		model.addAttribute("data_list1", data_list1); //자동주입이 안되니까 모델을 써서 모델로 넘기기
		
//-------ArrayList-------- * 한번에 넣을때 많이 쓰임 
		ArrayList<String> data_list2 = new ArrayList<>();
		data_list2.add("data1");
		data_list2.add("data2");
		data_list2.add("data3");
		model1.addAttribute("data_list2", data_list2);
		
//----------Map-----------
		KeyValueBean key_bean1 = new KeyValueBean();
		KeyValueBean key_bean2 = new KeyValueBean();
		KeyValueBean key_bean3 = new KeyValueBean();
		//key에는 항목1, 항목2... value에는 data1, data2...
		key_bean1.setKey("항목1");
		key_bean1.setValue("data1");
		key_bean2.setKey("항목2");
		key_bean2.setValue("data2");
		key_bean3.setKey("항목3");
		key_bean3.setValue("data3");
		
		//설정된 값을 ArrayList에 담기 
		ArrayList<KeyValueBean> data_list3 = new ArrayList<>();
		data_list3.add(key_bean1);
		data_list3.add(key_bean2);
		data_list3.add(key_bean3);
		model2.addAttribute("data_list3", data_list3);

		
		return "test1"; //resolver(모델이 뷰로 넘어감)
	}
	
}
