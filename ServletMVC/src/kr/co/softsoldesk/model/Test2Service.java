package kr.co.softsoldesk.model;

import javax.servlet.http.HttpServletRequest;

public class Test2Service {
	
	public static int minus(HttpServletRequest request) {
		int num1 = Integer.parseInt(request.getParameter("data1")) ;
		int num2 = Integer.parseInt(request.getParameter("data2"));
		int result = num1 - num2;
		return result;
	}
}
