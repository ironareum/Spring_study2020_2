package kr.co.softsoldesk.beans;

import javax.validation.constraints.AssertFalse;
import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class DataBean1 {
	//AssertTrue: true값 여부 확인 
	@AssertTrue
	private boolean data1;
	
	@AssertFalse
	private boolean data2;
	
	@Max(100)
	@Min(10)
	private int data3;
	
	@DecimalMax(value="100", inclusive=false)
	@DecimalMin(value="10", inclusive=false)
	private int data4;
	
	@Null
	private String data5;
	
	@NotNull
	private String data6;
	
	//정수 3자리, 소수 3자리...? 
	@Digits(integer=3, fraction=3)
	private String data7;
	
	//3~10글자 
	@Size(min=3, max=10)
	private String data8;
	
	@Pattern(regexp="^[a-zA-Z]*$") //regexp=".+@.+\\.[a-z]+" //<-이메일 // "^[a-zA-Z]*$"
	private String data9;
	
	@Pattern(regexp="[a-zA-Z].+@.+\\.[a-z]+", message = "이메일 형식이 잘못되었습니다.")
	private String data10;
	
	@Pattern(regexp="^[_0-9a-zA-Z0-9]+@[0-9a-zA-Z0-9]+(.[_0-9a-zA-Z0-9]+)*$")
	private String data11;
	
	//숫자, 영문자(대문자, 소문자) 특수문자 8~12글자사이 
	@Size(min=3, max=15)
	@Pattern(regexp="^[0-9a-zA-Z]*$", message="사용자 아이디는 영문자 숫자 조합만 가능 합니다.")
	private String userId;
	
	//특수문자 선/후 위치 
	@Pattern(regexp="([a-zA-Z0-9].*[!,@,#,$,%,^,&,*,?,_,~])|([!,@,#,$,%,^,&,*,?,_,~].*[a-zA-Z0-9]){8,12}" ,message="숫자 영문자 특수 문자를 포함한 8 ~ 12 자를 입력하세요. ")
	private String password;
	
	public DataBean1() {
		this.data1=true;
		this.data2=false;
		this.data3=50;
		this.data4=50;
		this.data5=null;
		this.data6="check2";
		this.data7="111.111";
		this.data8="asdfd";
		this.data9="aZ";
		this.data10="aA@c.com";
		this.data11="0aA@0c.com";
		this.userId="aZ1";
		this.password="qweQwe1@#$$%";
	}
	
	
	public boolean isData1() {
		return data1;
	}

	public void setData1(boolean data1) {
		this.data1 = data1;
	}

	public boolean isData2() {
		return data2;
	}

	public void setData2(boolean data2) {
		this.data2 = data2;
	}


	public int getData3() {
		return data3;
	}


	public void setData3(int data3) {
		this.data3 = data3;
	}


	public int getData4() {
		return data4;
	}


	public void setData4(int data4) {
		this.data4 = data4;
	}


	public String getData5() {
		return data5;
	}


	public void setData5(String data5) {
		this.data5 = data5;
	}


	public String getData6() {
		return data6;
	}


	public void setData6(String data6) {
		this.data6 = data6;
	}


	public String getData7() {
		return data7;
	}


	public void setData7(String data7) {
		this.data7 = data7;
	}


	public String getData8() {
		return data8;
	}


	public void setData8(String data8) {
		this.data8 = data8;
	}


	public String getData9() {
		return data9;
	}


	public void setData9(String data9) {
		this.data9 = data9;
	}


	public String getData10() {
		return data10;
	}


	public void setData10(String data10) {
		this.data10 = data10;
	}


	public String getData11() {
		return data11;
	}


	public void setData11(String data11) {
		this.data11 = data11;
	}


	public String getUserId() {
		return userId;
	}


	public void setUserId(String userId) {
		this.userId = userId;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	
	
	
	
	
	
	
}
