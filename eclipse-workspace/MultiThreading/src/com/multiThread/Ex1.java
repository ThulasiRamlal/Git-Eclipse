package com.multiThread;
import java.util.Scanner;

public class Ex1 implements Runnable {
	public void run()
	{
	Thread t=Thread.currentThread();
	String name=t.getName();
	if(name.equals("type"))
	{
		type();
	}
	else if(name.equals("mul"))
	{
		multiply();
	}
	else
	{
		search();
	}
		
	}
	public void type()
	{
		try
		{
		Scanner scan=new Scanner(System.in);
		System.out.println("TYPING ACTIVITY STARTED");
		String sen=" ";
		for(int i=0;i<10;i++)
		{
			System.out.println("Enter "+i+" word");
			String word=scan.next();
			sen=word+" "+sen;
			
		}
		Thread.sleep(2000);
		System.out.println(sen);
		System.out.println("TYPING ACTIVITY ENDED");
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
		Scanner scan=new Scanner(System.in);
		System.out.println("MULTIPLY ACTIVITY STARTED");
		System.out.println("Enter A value");
		int a=scan.nextInt();
		System.out.println("Enter B value");
		int b=scan.nextInt();
		Thread.sleep(2000);
		System.out.println("Multiplication: "+(a*b));
	    System.out.println("MULTIPLY ACTIVITY ENDED");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void search()
	{
		try
		{
		System.out.println("SEARCHING ACTIVITY STARTED");
		int [] arr= {1,2,3,4,5,6,7,8,9};
		int key=7;
		for(int i=0;i<arr.length;i++)
		{
			if(key==arr[i])
			{
				Thread.sleep(5000);
				System.out.println("Key found "+i+" Index");
			}
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
}
