package com.practice;

public class Deadtest {
	public static void main(String[] args) {
		Dead d1=new Dead();
		
		
		Thread t1=new Thread(d1);
		Thread t2=new Thread(d1);
		t1.setName("s1");
		t2.setName("s2");
		
		t1.start();
		t2.start();
		
	}

}
