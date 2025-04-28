package com.multiThread;
import java.util.Scanner;

public class MultiThreadDemoTest extends Thread {

	@Override
	public void run() {
	Thread	t=Thread.currentThread();
	String name=t.getName();
	if(name.equals("type"))
	{
		typeng();
	}
	else if(name.equals("mul"))
	{
		 multiply();
	}
	else
	{
		searching();
	}
		
	}
	
	public void typeng()
	{
		try
		{
		Scanner scan=new Scanner(System.in);
		System.out.println("Typing Activity Started");
		String sen="";
		for(int i=0;i<10;i++)
		{
			String word=scan.next();
			sen=word+" "+sen;
		}
		Thread.sleep(4000);
		System.out.println(sen);
		System.out.println("Typeing Activity Ended");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void multiply()
	{
		try
		{
		System.out.println("Multiply Activity Started");
	     int a=10;
	     int b=20;
	     Thread.sleep(4000);
	     System.out.println(a*b);
	      System.out.println("Multiply Activity Started");
		}
       catch(Exception e)
		{
	     e.printStackTrace();
		}
	}
	
	public void searching()
	{
		try
		{
		System.out.println("Searching Activity Started");
		int arr[] = {1,2,3,4,5,6,7,8,9};
		int key=7;
		for(int i=0;i<arr.length;i++)
		{
			if(key==arr[i])
			{
				Thread.sleep(4000);
				System.out.println("Key found "+i+" index");
			}
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	

}
