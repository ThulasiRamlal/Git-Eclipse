package com.threadmutiplethread;

public class Demo4Test {
	public static void main(String[] args) {
		Demo4 d1=new Demo4();
		Demo4 d2=new Demo4();
		Demo4 d3=new Demo4();
		//Creating Thread Object
		Thread t1=new Thread(d1);
		Thread t2=new Thread(d2);
		Thread t3=new Thread(d3);
		
		//Set Name
		t1.setName("type");
		t2.setName("mul");
		t3.setName("search");
		
		//Start method
		t1.start();
		t2.start();
		t3.start();

		
	}

}
