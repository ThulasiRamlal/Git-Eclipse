package com.singlethread;
import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
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
