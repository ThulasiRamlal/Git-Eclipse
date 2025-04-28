package com.runnabblemutiplethread;

public class interuptTest {
	public static void main(String[] args) {
		try
		{
		System.out.println("Main threading starting allocation");
		Demo4 d=new Demo4();
		//Creating thread objects because demo4 class Implements Runnable Interface
		Thread t1=new Thread(d);
		Thread t2=new Thread(d);
		
		
		//set name
		t1.setName("type");
		t2.setName("mul");
		
		
		t1.start();
		t2.start();
		t2.interrupt();
		t1.join();
		t2.join();
		System.out.println("Main Threading ending allocation");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		

	}
}
