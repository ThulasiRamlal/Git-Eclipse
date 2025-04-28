package com.runnabblemutiplethread;

import java.util.Scanner;

public class interupt implements Runnable {
	@Override
	public void run() {
		
		
			Thread t=Thread.currentThread();
		String name=t.getName();
		if(name.equals("type"))
		{
			type();
		}
		else 
		{
			multiple();
		}
			
			
	}
		
		public void type()
		{
			try
			{
			Scanner scan=new Scanner(System.in);
			System.out.println("TYPING ACTIVITY STARTED");
			String sen="";
			for(int i=0;i<10;i++)
			{
				System.out.println("Enter Word "+i+" index");
				String name=scan.next();
				sen=name+" "+sen;
			}
			Thread.sleep(2000);
			System.out.println(sen);
			System.out.println("TYPING ACITVITY ENDED");
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
		}
		
		public void multiple()
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
		


