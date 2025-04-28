package com.thread;

import java.util.Scanner;

public class SingleThreaded {
	public static void main(String[] args) {
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
			
			
			System.out.println("Typing Actitvity Ended");
			Thread.sleep(4000);
			System.out.println("Multiplication Activity Started");
			int a=10;
			int b=20;
			
			System.out.println(a*b);
			System.out.println("Multiplication Acitivity Ended");
			Thread.sleep(4000);
			System.out.println("Searching Activity Started");
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
			Thread.sleep(4000);
			System.out.println("All tasks completed");
		}
			catch(Exception e)
			{
				
				e.printStackTrace();
			}
		
	}

}
