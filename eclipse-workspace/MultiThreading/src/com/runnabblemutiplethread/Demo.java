package com.runnabblemutiplethread;

import java.util.Scanner;

public class Demo implements Runnable {

	@Override
	public void run() {
		
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

}
