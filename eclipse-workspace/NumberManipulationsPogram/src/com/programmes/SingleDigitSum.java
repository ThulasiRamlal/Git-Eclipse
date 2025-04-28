package com.programmes;
import java.util.Scanner;

public class SingleDigitSum {
	public static void main(String[] args) {
		SingleDigitSum teja= new SingleDigitSum();
		Scanner scan=new Scanner(System.in);
		System.out.println("enter value");
		int n=scan.nextInt();
		
		teja.display(n);
		
	}
	public void display(int n)
	{
		int sum=0;
		while(n!=0)
		{
			int rem=n%10;
			sum=sum+rem;
			n=n/10;
			
		}
		System.out.println(sum+" :Single digit sum");
	}

}
