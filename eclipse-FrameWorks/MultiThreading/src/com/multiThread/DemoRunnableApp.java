package com.multiThread;

public class DemoRunnableApp {
	public static void main(String[] args) {
		DemoRunnable d1=new DemoRunnable();
		
		//Creating thread objects
		
		Thread t=new Thread(d1);
		Thread t1=new Thread(d1);
		Thread t2=new Thread(d1);
		
		t.setName("type");
		t1.setName("mul");
		t2.setName("search");
		
		try
		{
		t.start();
		t.join();
		//t.interrupt();
		t1.start();
		t2.join();
		t2.start();
		t2.join();
		
	}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

}
