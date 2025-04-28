package com.programmes1;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter value");
	int n=scan.nextInt();
	System.out.println("Starting point");
	int m=scan.nextInt();
	display(n,m);
	
	
	}
	public static void display(int n,int m)
	{
		int sum=0;
		for(int i=m;i<=n;i++)
		{
			sum=sum+i;
		}
		System.out.println(sum);
	}
}
