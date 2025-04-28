package com.runnabblemutiplethread;

public class Demo2 implements Runnable {

	@Override
	public void run() {
		{
			try
			{
			System.out.println("MULTIPLY ACTIVITY STARTED");
			int a=10;
			int b=20;
			int c=a*b;
			
			Thread.sleep(2000);
			System.out.println("Multiple: "+c);
			System.out.println("MULTIPLY ACTIVITY ENDED");
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		
	}
	

	}
}
