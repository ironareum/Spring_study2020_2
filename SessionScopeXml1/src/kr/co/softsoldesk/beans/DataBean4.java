package kr.co.softsoldesk.beans;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

@Component(value="sessionBean4")
@SessionScope
public class DataBean4 {
	private String data7;
	private String data8;
	
	public String getData7() {
		return data7;
	}
	public void setData7(String dta7) {
		this.data7 = dta7;
	}
	public String getData8() {
		return data8;
	}
	public void setData8(String dta8) {
		this.data8 = dta8;
	}
	
	
	
}
