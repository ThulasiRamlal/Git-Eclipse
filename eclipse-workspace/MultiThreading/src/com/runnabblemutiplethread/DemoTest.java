package com.runnabblemutiplethread;

public class DemoTest {
	public static void main(String[] args) {
		
	
	
	Demo d1=new Demo();
	Demo2 d2=new Demo2();
	Demo3 d3=new Demo3();

//Creating Thread Object beacuse here all classes Implements Runnable interface
	Thread t1=new Thread(d1);
	Thread t2=new Thread(d2);
	Thread t3=new Thread(d3);
	
	t1.start();
	t2.start();
	t3.start();
	
	}
}
