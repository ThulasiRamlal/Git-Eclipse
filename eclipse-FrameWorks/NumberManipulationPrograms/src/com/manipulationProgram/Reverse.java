package com.manipulationProgram;

import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter A NUMBER...");
		int num=scan.nextInt();
		reverse(num);
		
	}
	
	public static void reverse(int num)
	{
		
		
		int rev=0;
		
		while(num>0)
		{
		int rem=num%10;
		rev=rev*10+rem;
		 num=num/10;
		}
		System.out.println("Reverse: "+rev);
	}

}
