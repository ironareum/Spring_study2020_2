package kr.co.softsoldesk.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//프로젝트 시작시 젤 먼저 가져오는 클래스. servletContext.xml 과 동일  
//(servlet-context에서 <annotation-driven/>와 같음)

@Configuration  
// Controller 어노테이션이 설정되어있는 클래스를 등록하는 어노테이션 
@EnableWebMvc

//scan 할 패키지 등록 
@ComponentScan("kr.co.softsoldesk.controller")
public class ServletAppContext implements WebMvcConfigurer{
	
	//controller메서드(ex.home())에서 반환하는 문자열 앞,뒤에 붙을 경로
	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		WebMvcConfigurer.super.configureViewResolvers(registry);
		registry.jsp("/WEB-INF/views/",".jsp"); //경로, 확장자 
	}
	
	//정적데이터(이미지, 사운드, 동영상, js, css) 경로 설정 
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		WebMvcConfigurer.super.addResourceHandlers(registry);
		registry.addResourceHandler("/**").addResourceLocations("/resources/"); //로케이션: "최상위/리소스/그아래" 
	}
	
	
}
