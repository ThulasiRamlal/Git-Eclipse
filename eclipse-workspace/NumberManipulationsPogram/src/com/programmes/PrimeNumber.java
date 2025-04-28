package com.programmes;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		PrimeNumber teja= new PrimeNumber();
		Scanner scan=new Scanner(System.in);
		System.out.println("enter value");
		int n=scan.nextInt();
		teja.display(n);
		
	}
	public void display(int n)
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
			System.out.println(n+" is prime number");
		}
		else
		{
			System.out.println(n+" is not prime number");
		}
	}

}
