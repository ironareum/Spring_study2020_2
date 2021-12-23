package kr.co.softsoldesk.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
//모든 컨트롤러들을 어드바이스 해줄 수 있는 클래스 
import org.springframework.web.bind.annotation.ExceptionHandler;
@ControllerAdvice
public class GlobalExceptionHandler extends RuntimeException{
		
	@ExceptionHandler(java.lang.NullPointerException.class)
	public String exception2() {
		return "error2";
	}

}
