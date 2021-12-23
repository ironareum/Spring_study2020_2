package kr.co.softsoldesk.beans;

import javax.validation.constraints.Email;
import javax.validation.constraints.Negative;
import javax.validation.constraints.NegativeOrZero;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Positive;
import javax.validation.constraints.PositiveOrZero;

public class DataBean1 {
	
	//공백을 인정함
		@NotEmpty
		private String data1;
		
		//공백을 허용하지 않음
		@NotBlank
		private String data2;
		
		//0보다 커야함(양수)
		@Positive
		private int data3;
		
		//0 또는 양수만 허용
		@PositiveOrZero
		private int data4;
		
		//음수만 허용
		@Negative
		private int data5;
		
		//0 또는 음수만 허용
		@NegativeOrZero
		private int data6;
		
		@Email(regexp = "^[_0-9a-zA-Z]+@[0-9a-zA-Z]+(.[_0-9a-zA-Z]+)*$")
		private String data7;
		
		public DataBean1() {
//			this.data1 = "abcd";
//			this.data2 = "abcd";
//			this.data3 = 50;
//			this.data4 = 50;
//			this.data5 = -50;
//			this.data6 = -50;
		}

		public String getData1() {
			return data1;
		}

		public void setData1(String data1) {
			this.data1 = data1;
		}

		public String getData2() {
			return data2;
		}

		public void setData2(String data2) {
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

		public int getData5() {
			return data5;
		}

		public void setData5(int data5) {
			this.data5 = data5;
		}

		public int getData6() {
			return data6;
		}

		public void setData6(int data6) {
			this.data6 = data6;
		}

		public String getData7() {
			return data7;
		}

		public void setData7(String data7) {
			this.data7 = data7;
		}
	
	
}
