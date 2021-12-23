package kr.co.softsoldesk.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import kr.co.softsoldesk.interceptor.TestInterceptor1;
import kr.co.softsoldesk.interceptor.TestInterceptor2;
import kr.co.softsoldesk.interceptor.TestInterceptor3;
import kr.co.softsoldesk.interceptor.TestInterceptor4;
import kr.co.softsoldesk.interceptor.TestInterceptor5;
import kr.co.softsoldesk.interceptor.TestInterceptor6;
import kr.co.softsoldesk.interceptor.TestInterceptor7;
import kr.co.softsoldesk.interceptor.TestInterceptor8;

//Spring MVC 프로젝트에 관련된 설정을 하는 클래스
//(servlet-context에서 <annotation-driven/>와 같음)
@Configuration 

//Controller 어노테이션이 셋팅되어 있는 클래스를 Controller로 등록한다.
@EnableWebMvc

//스캔할 패키지를 지정한다.
@ComponentScan("kr.co.softsoldesk.controller")
public class ServletAppContext implements WebMvcConfigurer{
	// Controller의 메서드가 반환하는 jsp의 이름 앞뒤에 경로와 확장자를 붙혀주도록 설정한다.
	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		WebMvcConfigurer.super.configureViewResolvers(registry);
		registry.jsp("/WEB-INF/views/", ".jsp");
	}
	
	// 정적 파일의 경로를 매핑한다.
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		WebMvcConfigurer.super.addResourceHandlers(registry);
		registry.addResourceHandler("/**").addResourceLocations("/resources/");
	}
	
	//인터셉터 등록
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		WebMvcConfigurer.super.addInterceptors(registry);
		
		//인터셉터 클래스의 객체 만들기
		TestInterceptor1 inter1 = new TestInterceptor1();
		TestInterceptor2 inter2 = new TestInterceptor2();
		TestInterceptor3 inter3 = new TestInterceptor3();
		TestInterceptor4 inter4 = new TestInterceptor4();
		TestInterceptor5 inter5 = new TestInterceptor5(); // 중간에 sub1이 있어도 상관없다를 보여줄려고 해보는 5. 
		TestInterceptor6 inter6 = new TestInterceptor6();
		TestInterceptor7 inter7 = new TestInterceptor7();
		TestInterceptor8 inter8 = new TestInterceptor8();
		
		//인터셉터 등록
		InterceptorRegistration reg1 = registry.addInterceptor(inter1);
		InterceptorRegistration reg2 = registry.addInterceptor(inter2);
		InterceptorRegistration reg3 = registry.addInterceptor(inter3);
		InterceptorRegistration reg4 = registry.addInterceptor(inter4);
		InterceptorRegistration reg5 = registry.addInterceptor(inter5);
		InterceptorRegistration reg6 = registry.addInterceptor(inter6);
		InterceptorRegistration reg7 = registry.addInterceptor(inter7);
		InterceptorRegistration reg8 = registry.addInterceptor(inter8);
		
		//인터셉터 주소 만들기(관심사 등록)  
		reg2.addPathPatterns("/test1");
		reg1.addPathPatterns("/test1");
		//reg2.addPathPatterns("/test1", "/test2"); //이렇게 여러개도 걸수 있다고 함 
		reg3.addPathPatterns("/test2");
		reg4.addPathPatterns("/test1","/test2");
		reg5.addPathPatterns("/sub1/test3","/sub1/test4");
		reg6.addPathPatterns("/*"); //경로 하나짜리 아래의 모두 적용 
		reg7.addPathPatterns("/sub1/*"); //경로가 sub1 아래의 모두 적용 
		reg8.addPathPatterns("/**"); //모든 경로 적용  
		
		//관심사 경로제외 
		reg8.excludePathPatterns("/*"); //경로하나짜리는 모두 제외하겠다. 
		
		
	}
	
}
