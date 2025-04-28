package com.programmes1;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter value");
		int n=scan.nextInt();
		display(n);
		
	}
	public static void display(int n)
	{
		int count=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println("Prime number");
		}
		else
		{
			System.out.println("not primeNumber");
		}
	}

}
