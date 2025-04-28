package com.programmes;
import java.util.Scanner;
public class ReverseNumber {
	public static void main(String[] args) {
		ReverseNumber teja=new ReverseNumber();
		Scanner scan= new Scanner(System.in);
		System.out.println("enter a number");
		int n=scan.nextInt();
		teja.display(n);
		
	}
	public void display(int n)
	{
		int rev=0;
		while(n>0)
		{
			int rem=n%10;
		 rev=rev*10+rem;
			 n=n/10;
			
		}
		 System.out.print(rev);
		
	}

}
