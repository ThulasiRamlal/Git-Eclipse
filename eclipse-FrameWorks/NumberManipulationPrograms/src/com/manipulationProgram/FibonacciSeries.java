package com.manipulationProgram;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("ENter NUMBER....");
		int n=scan.nextInt();
		fibonnaci(n);
		
	}
	public static void fibonnaci(int n)
	{
		
		int num1=0;
		int num2=1;
		int res=0;
		
		for(int i=3;i<=n;i++)
		{
			
			res=num1+num2;
			num1=num2;
			num2=res;
		}
		System.out.println("Fibanaaci "+n+" th Number is "+res);
		
		
		
		
	}
	

}
