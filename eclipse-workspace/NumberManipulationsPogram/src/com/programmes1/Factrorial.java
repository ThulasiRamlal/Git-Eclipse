package com.programmes1;

import java.util.Scanner;

public class Factrorial {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter value");
		int n=scan.nextInt();
		display(n);
		
	}
	public static void display(int n)
	{
		int mul=1;
		for(int i=1;i<=n;i++)
		{
			mul=mul*i;
		}
		System.out.println(mul);
	}

}
