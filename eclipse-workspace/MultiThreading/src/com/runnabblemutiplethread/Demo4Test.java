package com.runnabblemutiplethread;

public class Demo4Test {
	public static void main(String[] args) {
		Demo4 d=new Demo4();
		//Creating thread objects because demo4 class Implements Runnable Interface
		Thread t1=new Thread(d);
		Thread t2=new Thread(d);
		Thread t3=new Thread(d);
		
		//set name
		t1.setName("type");
		t2.setName("mul");
		t3.setName("search");
		
		t1.start();
		t2.start();
		t3.start();
		
	}

}
