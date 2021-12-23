package kr.co.softsoldesk.config;

import javax.servlet.FilterRegistration;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.DispatcherServlet;

//기본 환경설정 web.xml과 동일. 프로젝트 시작하면 가장먼저 시작하는 파일에 해당 
public class SpringConfigClass implements WebApplicationInitializer{
	
	//프로젝트 시작하면 젤 먼저 읽음 
	@Override 							//컨트롤러 추가 
	public void onStartup(ServletContext servletContext) throws ServletException {
		//System.out.println("onStartup");
		
		//(web.xml에서 <servlet> 구현부와 같음)
		//프로젝트 구현을 위한 클래스 객체 생성  
		AnnotationConfigWebApplicationContext servletAppContext = new AnnotationConfigWebApplicationContext(); //어노테이션으로 컨테이너에 등록
		servletAppContext.register(ServletAppContext.class); //객체생성 
		
		//요청 정보를 분석해서 컨트롤러를 선택하는 서블릿을 지정한다 
		DispatcherServlet dispatcherServlet = new DispatcherServlet(servletAppContext); //servletAppContext에 담긴 내용을 디스패치로 전송 
		//매개변수로 선언된 servletContext 객체를 이용하여 servlet에 추가 
		ServletRegistration.Dynamic servlet =servletContext.addServlet("dispacher", dispatcherServlet); //dispatcher까지 끝난 객체(컨트롤러)를 넘김. 
		//ServletRegistration.Dynamic : 메모리안에 넣는것. 
		
		//부가설정 
		servlet.setLoadOnStartup(1); //추가 후 loading을 어떤경 우라도 가장 먼저 읽도록 설정. '1' //위에서 설정한 서블릿을 말함. 
		servlet.addMapping("/"); //'/'안에 모든 경로에 적용하겠다. 
		
		//=====================================
		//(web.xml에서 <context-param>구현부와 같음)
		//Bean을 정의할 xml 파일을 지원한다 
		AnnotationConfigWebApplicationContext rootAppContext = new AnnotationConfigWebApplicationContext(); //어노테이션으로 컨테이너에 등록
		rootAppContext.register(RootAppContext.class); //객체생성 
		
		//(web.xml에서 <listsener> 구현부와 같음)
		ContextLoaderListener listener =  new ContextLoaderListener(rootAppContext);//등록한 빈 객체(rootAppContext)를 리스닝 하고 있으라는 설정 
		servletContext.addListener(listener);
		
		//(web.xml에서 <filter> 구현부와 같음)
		FilterRegistration.Dynamic filter = servletContext.addFilter("encodingFilter", CharacterEncodingFilter.class);
		filter.setInitParameter("encoding", "UTF-8");
	    //dispatcher에 의해서 추가된 Servlet에 UTF-8로 encoding하겠다는 구현부
		filter.addMappingForServletNames(null, false, "dispatcher");
		
	}

}
