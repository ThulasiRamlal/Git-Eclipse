package com.singleThread;

import java.util.Scanner;

public class SingleThread {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		try
		{

		System.out.println("Typing Activity Started..");
		
		
		String sen="";
		String name;
		for(int i=1;i<=5;i++)
		{
			System.out.println("Enter "+ i+" Name ");
			name=scan.next();
			sen=name+" "+sen;
			
		}
		Thread.sleep(2000);
		System.out.println(sen);
		System.out.println("Typing Actvity Ended...");
		
	}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	//=============================================================================	
		try
		{
		System.out.println("Multiplication Activity Started...");
		System.out.println("Enter Two Integer values..");
		int i=scan.nextInt();
		int j=scan.nextInt();
		
		int k=i*j;
		Thread.sleep(2000);
		System.out.println(k);
		System.out.println("Multiplication Activity Ended...");
	
	}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	//=======================================================================================	
		try
		{
		System.out.println("Enter The Size of Array..");
		int[] arr=new int[scan.nextInt()];
		
		for(int i=0;i<arr.length;i++)
		{
		
			System.out.println("Enter "+i+" Value..");
			arr[i]=scan.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		System.out.println("Searching operation started....");
		
		System.out.println("Enter the KEY for searching...");
		
		int key=scan.nextInt();
		String found;
		for(int i=0;i<arr.length;i++)
		{
			if(key==arr[i])
			{
			   Thread.sleep(2000);
				 found="Key Found in "+i+" Index..";
				 System.out.println(found);
			}
			else
			{
				System.out.println("Key not found Any Index...");
			}
			
		}
		
		System.out.println("Searching Activity Ended...");
		
		
	}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	
	
	
	}
}


