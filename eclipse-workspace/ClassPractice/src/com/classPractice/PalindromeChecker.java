package com.classPractice;

import java.util.Scanner;

public class PalindromeChecker {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter Num: ");
		int num=scan.nextInt();
		PalindromeChecker teja=new PalindromeChecker();
		teja.palindromeChecker(num);
	}
	public void palindromeChecker(int num)
	{
	  int i=num;
		while(num>0)
		{
			int rev=0;
			int rem=num%10;
			rev=(rev*10)+rem;
			int num1=num/10;
			if(i==num)
			{
				System.out.println(rev+"yes");
			}
			else
			{
				System.out.println(rev+" No ");
			}
			
		}
	}
	

}
