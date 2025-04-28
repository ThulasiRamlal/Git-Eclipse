package com.manipulationProgram;

import java.util.Scanner;

public class SumOfNatural {
	public static void main(String[] args)
	{
		
		System.out.println("Enter NUMBER...");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		sumOfNatural(n);
		
		
	}
	public static void sumOfNatural(int n)
	{
		int sum=0;
		while(n>0)
		{
			int rem=n%10;
			sum=sum+rem;
			n=n/10;
		}
		System.out.println("Sum OF Natural Number: "+sum);
		
	}

}
