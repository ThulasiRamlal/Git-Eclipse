package com.multiThreading;

import java.util.Scanner;

public class SumOfSquare {
	public static void main(String[] args) {
		//Sum Of Square
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter The Loop Size");
		int n=scan.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			int square=i*i;
		   sum=square+sum;
		}
		System.out.println("sumOfSquaure: "+sum);
		
		
	}

}
