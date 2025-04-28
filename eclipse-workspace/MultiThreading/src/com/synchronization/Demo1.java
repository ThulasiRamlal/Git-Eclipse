package com.synchronization;

public class Demo1 implements Runnable {

	@Override
	synchronized public void run() {
		try
		{
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName()+" Is entering Bathroom");
		Thread.sleep(5000);
		System.out.println(Thread.currentThread().getName()+" Is using Bathroom");
		Thread.sleep(5000);
		System.out.println(Thread.currentThread().getName()+" Is Existing Bathroom");
		Thread.sleep(5000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	

}
