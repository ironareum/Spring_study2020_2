package kr.co.softsoldesk.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.softsoldesk.model.Test2Service;

//@WebServlet :프레임(패키지)에 들어있는 클래스들 자동인지해서 가져옴 (=프레임워크)
@WebServlet("*.mvc") //동일한 이름 2개 이 불가능하지만 Spring에서는 가능(= *. 으로 다수명시 가능).  
public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public HomeController() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//System.out.println("HomeController");
		String url= request.getRequestURI();
//		System.out.println(url);
		String viewName = null;
		
		if(url.contains("main.mvc")) {
			//System.out.println("main 요청 ");
			viewName="main.jsp";
		} else if(url.contains("test1.mvc")) {
			//System.out.println("test1 요청 ");
			
			//(모델부분=기능 )에서의 코드는 가독과 유지보수가 어려워서 (현재는) 만들지 않음.
			//파라미터 데이터 추출 
			String str1 = request.getParameter("data1");
			String str2 = request.getParameter("data2");
			int num1 = Integer.parseInt(str1);
			int num2 = Integer.parseInt(str2);
			int result = num1 + num2;
			
			//view로 떠넘어갈때 현재의 계산한 결과값을 가져감
			request.setAttribute("result", result);
			
			//페이지전환 url 
			viewName="test1.jsp";
			
		} else if(url.contains("test2.mvc")) {
			//System.out.println("test2 요청 ");
			
			//모델이 별도의 model패키지에 구현되어 있음 
			int result =Test2Service.minus(request); //
			request.setAttribute("result", result);
			
			viewName="test2.jsp";
		}
		
		//view로 떠넘기기  
		RequestDispatcher dis = request.getRequestDispatcher(viewName); //요청된 주소를 담아서 view로 보냄 
		dis.forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}


}
