package com.programmes1;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter value");
		int n=scan.nextInt();
		display(n);
		
		
	}
	public static void display(int n)
	{
		int n1=0;
		int n2=1;
		int res=0;
		for(int i=3;i<=n;i++)
		{
			 res=n1+n2;
			 n1=n2;
			n2=res;
			
			System.out.println(res+" ");
		}
		
		
	}

}
