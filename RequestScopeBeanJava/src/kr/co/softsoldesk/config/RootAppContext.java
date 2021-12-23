package kr.co.softsoldesk.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.RequestScope;

import kr.co.softsoldesk.beans.DataBean1;
import kr.co.softsoldesk.beans.DataBean2;

//프로젝트 작업시 사용할 bean, dao, mapper등 을 정의하는 클래스
@Configuration
public class RootAppContext {
	//RequestScope : 메소드를 호출하지 않아도, 해당하는 인스턴스객체만 생성한다면 자동으로 주입을 도와줌
	@Bean
	@RequestScope //새로운 요청이 발생하면 호출되는 메소드  
	public DataBean1 databean1() {
		
		return new DataBean1(); //객체 생성 
	}

	@Bean("requestBean2")
	@RequestScope //새로운 요청이 발생하면 호출되는 메소드  
	public DataBean2 databean2() {
		
		return new DataBean2(); //객체 생성 
	}
	
}
