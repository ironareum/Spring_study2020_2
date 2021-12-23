package kr.co.softsoldesk.beans;

import org.springframework.stereotype.Component;


public class DataBean {
	
	private int data1; //100
	private int data2; //200
	private int [] data3; //300,400
	
	
	public int getData1() {
		return data1;
	}
	public void setData1(int data1) {
		this.data1 = data1;
	}
	public int getData2() {
		return data2;
	}
	public void setData2(int data2) {
		this.data2 = data2;
	}
	public int[] getData3() {
		return data3;
	}
	public void setData3(int[] data3) {
		this.data3 = data3;
	}
	
	
	
}
