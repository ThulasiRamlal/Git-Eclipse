package com.threadmutiplethread;

public class Demo3 extends Thread {

	@Override
	public void run() {
	
		try 
		{
			System.out.println("SEARCHING ACTIVITY STARTED");
			int arr[]= {1,2,3,4,5,6,7,8,9};
			int key=7;
			for(int i=0;i<arr.length;i++)
			{
				if(key==arr[i])
				{
					Thread.sleep(2000);
					System.out.println("Key found in "+i+" index");
				  System.out.println("SERACHING ACTIVITY ENDED");
				}
			}	
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}	
	}
	}
	

	

