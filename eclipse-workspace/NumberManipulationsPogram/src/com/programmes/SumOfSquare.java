package com.programmes;
import java.util.Scanner;
public class SumOfSquare {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("enter value: ");
		int n=scan.nextInt();
		display(n);
		
	}
	public static void display(int n)
	{
		int sum=0;
		for(int i=0;i<=n;i++)
		{
			sum=sum+(i*i);
		}
		System.out.println(sum);
	}

}
