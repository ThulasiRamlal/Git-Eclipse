package com.runnabblemutiplethread;

public class Demo6 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try
		{
		System.out.println(Thread.currentThread().getName()+" is entering Bathroom");
		Thread.sleep(5000);
		System.out.println(Thread.currentThread().getName()+" is using Bathroom");
		Thread.sleep(5000);
		System.out.println(Thread.currentThread().getName()+" is coming Bathroom");
		Thread.sleep(5000);
		
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
