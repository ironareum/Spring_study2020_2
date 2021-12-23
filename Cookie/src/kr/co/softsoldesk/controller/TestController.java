package kr.co.softsoldesk.controller;



import java.net.URLEncoder;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
	
	//cookie : 브라우저에 저장. 브라우저의 응답을 받을시 response로 받아옴. only 문자만 받아올 수 있음. 
	
	@GetMapping("/save_cookie")
	public String save_cookie(HttpServletResponse response) {
		
		try {
			//쿠키는 문자만 처리하므로 encoding이 필수 
			String data1 = URLEncoder.encode("문자1","UTF-8");
			String data2 = URLEncoder.encode("문자2","UTF-8");
			
			//데이터 저장 
			Cookie cookie1 = new Cookie("cookie1", data1);
			Cookie cookie2 = new Cookie("cookie2", data2);
			
			//cookie의 수명
			cookie1.setMaxAge(365*24*60*60); //day*hour*min*sec
			cookie2.setMaxAge(365*24*60*60);
			
			//response에 쿠키정보 담기 = 브라우저 dome에 들어옴 
			response.addCookie(cookie1);
			response.addCookie(cookie2);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "save_cookie";
	}
	
	/*@GetMapping("/load_cookie")
	public String load_cookie(HttpServletRequest request) {
		try {
			Cookie[] cookies= request.getCookies(); //cookie를 다 가져옴 
			for(Cookie cookie : cookies) {
				//한글표현을 하기위한 decode
				String str = URLDecoder.decode(cookie.getValue(), "UTF-8");
				//Cookie의 이름으로 분리하여 선별적 사용을 함
				if(cookie.getName().equals("cookie1")) {
					//추후 구현부 
					System.out.println("cookie1 : "+ str);
				} else if(cookie.getName().equals("cookie2")) {
					System.out.println("cookie2 : "+ str);
				}
	
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "load_cookie";
	}*/
	
	//매개변수에 어노테이션 올려놓고 쓰는법
	//쿠키요청정보를 처음부터 인지하여 들어오므로 이름으로 선별이 가능하고 디코딩 처리도 자동으로 구현되어 있음 
	//cookieValue()에 주입한 이름으로 브라우저에 저장되어있는 쿠키변수명의 값을 찾아와서 String변수명안에 넣어줌...? 
	@GetMapping("/load_cookie2")
	public String load_cookie2(@CookieValue("cookie1") String cookie1,
								@CookieValue("cookie2") String cookie2) {
		System.out.println("cookie1: "+cookie1 );
		System.out.println("cookie2: "+cookie2 );
		
		return "load_cookie2";
	}
	
}
