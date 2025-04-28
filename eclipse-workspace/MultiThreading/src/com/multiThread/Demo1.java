package com.multiThread;

import java.util.Scanner;

public class Demo1 extends Thread{

	@Override
	public void run() {
		try {
		Scanner scan=new Scanner(System.in);
		System.out.println("Typing Activity Started");
		String sen="";
		//String word = null;
		for(int i=0;i<10;i++)
		{
			System.out.println("Type "+i+" word about Kodnest");
			String word=scan.next();
			 sen=word+" "+sen+" ";
			System.out.println(sen);	
		}
		
		Thread.sleep(4000);
		System.out.println("Typing Actitvity Ended");
		
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	
		
	}
}


