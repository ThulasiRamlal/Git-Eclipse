package com.manipulationProgram;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("ENter NUMBER...");
		int n=scan.nextInt();
		 primeNumber(n);
		
	}
	public static void primeNumber(int n)
	{
		int count=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
				
		}
		if(count<=2)
		{
			System.out.println("prime NUmber...");
		}
		else
		{
			System.out.println("Not prime nUmber...");
		}
		
	}

}
