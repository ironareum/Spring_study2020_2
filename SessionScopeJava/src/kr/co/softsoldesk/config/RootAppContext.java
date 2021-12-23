package kr.co.softsoldesk.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.SessionScope;

import kr.co.softsoldesk.beans.DataBean1;
import kr.co.softsoldesk.beans.DataBean2;

//프로젝트 작업시 사용할 bean을 정의하는 클래스
@Configuration
public class RootAppContext {
	
	//빈등록
	@Bean
	@SessionScope
	public DataBean1 bean1() {
		return new DataBean1();
	}
	
	//이름으로 등록 ("sessionBean2")
	@Bean("sessionBean2")
	@SessionScope
	public DataBean2 bean2() {
		return new DataBean2();
	}
}
