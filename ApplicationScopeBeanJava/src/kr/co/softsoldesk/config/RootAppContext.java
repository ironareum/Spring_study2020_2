package kr.co.softsoldesk.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.ApplicationScope;

import kr.co.softsoldesk.beans.DataBean1;
import kr.co.softsoldesk.beans.DataBean2;

//프로젝트 작업시 사용할 bean을 정의하는 클래스
@Configuration
public class RootAppContext {
	
	//applicationBean1 (type injection) ->적용시 오토와이어 사용 
	@Bean
	@ApplicationScope
	public DataBean1 applicationBean1() {
		return new DataBean1();
	}
	
	//applicationBean1 (name injection) -> 적용시 리소스 사용 
	@Bean("applicationBean2")
	@ApplicationScope
	public DataBean2 applicationBean2() {
		return new DataBean2();
	}
	
}
