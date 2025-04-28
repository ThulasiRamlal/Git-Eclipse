package com.manipulationProgram;

import java.util.Scanner;

public class Factors {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter NUMBER....");
		int n=scan.nextInt();
		factor(n);
	}
	public static void factor(int n)
	{
		int fac=0;
		for(int i=1;i<=n;i++)
		{
			
			if(n%i==0)
			{
				System.out.println("Factors: "+i);
			}
		}
	}

}
