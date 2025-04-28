package com.multiThread;

public class MultiThreadDemo {
	public static void main(String[] args) {
		//Creating Thread type object
		MultiThreadDemoTest d1=new MultiThreadDemoTest();
		MultiThreadDemoTest d2=new MultiThreadDemoTest();
		MultiThreadDemoTest d3=new MultiThreadDemoTest();
		d1.setName("type");
		d2.setName("mul");
		d3.setName("search");
		d1.start();
		d2.start();
		d3.start();
		
	}

}
