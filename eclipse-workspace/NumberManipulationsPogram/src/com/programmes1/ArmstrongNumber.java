package com.programmes1;
import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter value");
	int n=scan.nextInt();
	display(n);
	
	
	}
	public static void display(int n)
	{
		int a=n;
		int arm=0;
		while(n>0)
		{
			int rem=n%10;
			arm=arm+(rem*rem*rem);
			n=n/10;
		}
		if(arm==a)
		{
			System.out.println("Armstrong number");
		}
		else
		{
			System.out.println("Not Armstrong number");
		}
		
	}
}
