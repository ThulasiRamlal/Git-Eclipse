package com.multiThread;

public class Demo3 extends Thread {

	@Override
	public void run() {
		try
		{
		System.out.println("SERACHING ACTIVITY STARTED");
		
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		int key=10;
		for(int i=0;i<=arr.length-1;i++)
		{
			if(key==arr[i])
			{
				Thread.sleep(4000);
				System.out.println("Key found in "+i+" index");
				
			}
		   
		}
		
		System.out.println("Searching Acitivity Completed");
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		try
		{
		Thread.sleep(4000);
		System.out.println("All tasks completed");
	}
	catch(Exception e)
		{
		e.printStackTrace();
		}

	}
}
	


