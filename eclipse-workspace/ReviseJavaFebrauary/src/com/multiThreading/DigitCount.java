package com.multiThreading;

import java.util.Scanner;

public class DigitCount {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);	
	
	System.out.println("Enter The Number");
	long n=scan.nextLong();
	long count=0;
	while(n!=0)
	{
		n=n/10;
		count++;
	}
	System.out.println("DIGITS COUNT: "+count);
	
	}

}
