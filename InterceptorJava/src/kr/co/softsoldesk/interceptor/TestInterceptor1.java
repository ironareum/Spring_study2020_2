package kr.co.softsoldesk.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;

public class TestInterceptor1 implements HandlerInterceptor{
	
	//controller의 메소드가 호출되기전에 수행 
	//false를 반환하면 요청처리를 중단할 수 있다. 
	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {

		//return HandlerInterceptor.super.preHandle(request, response, handler);
		System.out.println("TestInterceptor1 - preHandle ");
		//return true;
		return false;
	}
	
	//controller의 메소드가 호출 된 후에 수행 
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		//HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
		System.out.println("TestInterceptor1 - postHandle");
	}
	
	//view 처리까지 완료된 후 수행 
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		//HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
		System.out.println("TestInterceptor1 - afterCompletion ");
	}
	
	
	
}
