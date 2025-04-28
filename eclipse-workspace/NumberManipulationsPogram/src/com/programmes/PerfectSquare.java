package com.programmes;

import java.util.Scanner;

public class PerfectSquare {
	public static void main(String[] args) {
		PerfectSquare teja= new PerfectSquare();
		Scanner scan= new Scanner(System.in);
		System.out.println("enter value");
		int n=scan.nextInt();
		teja.display(n);
		
	}
	public void display(int n)
	{
		int square;
		for(int i=1;i<=n;i++)
		{
			square=i*i;
			System.out.print(square+" ");
		}
		
	}

}
