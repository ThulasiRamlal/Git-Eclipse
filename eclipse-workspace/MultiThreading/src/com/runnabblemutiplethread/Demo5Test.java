package com.runnabblemutiplethread;

public class Demo5Test {
	public static void main(String[] args) {
		try
		{
		System.out.println("Main threading starting allocation");
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
		
		t1.join();
		t2.join();
		t3.join();
		System.out.println("Main Threading ending allocation");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
