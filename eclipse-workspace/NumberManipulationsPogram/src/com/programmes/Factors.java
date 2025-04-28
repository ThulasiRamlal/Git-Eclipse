package com.programmes;

import java.util.Scanner;

public class Factors {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Factors teja= new Factors();
		System.out.println("enter value");
		int n=scan.nextInt();
		teja.display(n);
		
	}
	public void display(int n)
	{
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				System.out.print(i+" ");
			}
		}
	}

}
