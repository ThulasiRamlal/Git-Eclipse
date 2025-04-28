package com.multiThread;

public class Demo2 extends Thread {

	@Override
	public void run() {
		try {
		System.out.println("MULTIPLICATION ACTIVITY STARTED");
		int a=10;
		int b=20;
		Thread.sleep(2000);
		System.out.println(a*b);
		System.out.println("MULTIPLICATION ACITVITY ENDED");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}


}
