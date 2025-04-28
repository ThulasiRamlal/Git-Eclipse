package com.programmes1;

import java.util.Scanner;

public class DigitCount {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a value");
		int n=scan.nextInt();
		DigitCount.method1(n);
		
	}
	public static void method1(int n)
	{
		int count=0;
		
		while(n!=0)
		{
			n=n/10;
			count++;
		}
		System.out.println(count);
	}

}
