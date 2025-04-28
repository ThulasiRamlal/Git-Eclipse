package com.multiThread;

public class ExTest {
	public static void main(String[] args) {
		
		Ex1 d1=new Ex1();
		
		
		Thread t1=new Thread(d1);
		Thread t2=new Thread(d1);
		Thread t3=new Thread(d1);
		t1.setName("type");
		t2.setName("mul");
		t3.setName("search");
		t1.start();
		t2.start();
		t3.start();
	}

}
