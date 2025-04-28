package com.multiThread;

import java.util.Scanner;

public class DemoRunnable implements Runnable {

	static Thread t=Thread.currentThread();
	@Override
	public void run() {
		
		
		String name=t.getName();
		if(name.equalsIgnoreCase("type"))
		{
			typing();
		}
		else if(name.equalsIgnoreCase("mul"))
		{
			multiply();
		}
		else
		{
			searching();
		}
		
		
	}
	
	public static  void typing()
	{
		try
		{
			
		System.out.println("TYPING ACTITVITY STARTED");
		 Scanner scan=new Scanner(System.in);
		 Thread.sleep(5000);
		System.out.println("ENTER THE 5 WORDS");
		
		String sen=" ";
		for(int i=1;i<=5;i++)
		{
			String word=scan.next();
			
			  sen=sen+word+" ";
			 System.out.println(sen);
		}
		
		System.out.println("TYPING ACTIVITY ENDED");
	}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void multiply()
	{
		try
		{
			
		System.out.println("MULTIPLY ACTIVITY  STARTED....");
		Thread.sleep(5000);
		 Scanner scan=new Scanner(System.in);
		
		 System.out.println("ENTER 'A' VALUE");
		 int a=scan.nextInt();
		 System.out.println("ENTER 'B' VALUE");
		 int b=scan.nextInt();
		// System.out.println("RESULT...");
		 
		 int c=a*b;
		
		 System.out.println("RESULT :"+c);
		 System.out.println("MULTIPLY ACTIVITY ENDED..");
		 
		 
	}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

	public static void searching()
	{
		try
		{
		Scanner scan=new Scanner(System.in);
		
		System.out.println("SEARCHING ACTIVITY STARTED");
		Thread.sleep(5000);
		int arr[]= {1,2,3,4,5,7,8,9};
		System.out.println("ENTER KEY FOR SEARCHING ..");
		int key=scan.nextInt();
		for(int i=0;i<arr.length;i++)
		{
			if(key==arr[i])
			{
				
				System.out.println("KEY FOUND IN "+key+" INDEX..");
				break;
				
			}
		}
		System.out.println("SEARCHING ACTIVITY  ENDED...");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
