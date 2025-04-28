package com.manipulationProgram;

import java.util.Scanner;

public class Palindrome {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter NUMBER.....");
		int num=scan.nextInt();
		palindrome(num);
		
	}
	
	public static void palindrome(int num)
	{
		int i=num;
		int pal=0;
		while(num>0)
		{
			int rem=num%10;
			pal=pal*10+rem;
			num=num/10;
		}
		
		if(i==pal)
		{
			System.out.println(pal+" is a PALINDROME...");
		}
		else
		{
			System.out.println(pal+" is a NOT PALINDROME...");
		}
		
	}

}
