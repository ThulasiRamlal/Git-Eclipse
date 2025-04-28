package com.programmes;
import java.util.Scanner;

public class NaturalOrderSum {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter a value");
		int n=scan.nextInt();
		NaturalOrderSum teja= new NaturalOrderSum();
		teja.display(n);
	}
	public void display(int n)
	{
		int sum=0;
		for(int i=0;i<=n;i++)
		{
			sum=sum+i;	
		}
		System.out.println(sum);
	}

}
