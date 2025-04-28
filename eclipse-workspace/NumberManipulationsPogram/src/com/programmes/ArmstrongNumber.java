package com.programmes;
import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		ArmstrongNumber teja= new ArmstrongNumber();
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number");
		int n=scan.nextInt();
		teja.display(n);
		
	}
	public void display(int n)
	{
		int i=n;
		int arm=0;
		while(n!=0)
		{
			int rem=n%10;
			arm=arm+(rem*rem*rem);
			n=n/10;
			
		}
		if(arm==i)
		{
			System.out.println(arm+" : is armstrong number");
		}
		else
		{
			System.out.println(arm+" : not armstrong number");
		}
		
	}

}
