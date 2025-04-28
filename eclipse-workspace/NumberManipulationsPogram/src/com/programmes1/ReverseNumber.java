package com.programmes1;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter Value");
	int n=scan.nextInt();
	display( n);
	
	
	}
	public static void display(int n)
	{
		int rev=0;
	while(n>0)
	{
		int rem=n%10;
		 rev=rev*10+rem;
		 n=n/10;
		
	}
	System.out.println(rev);
		
	}
}
