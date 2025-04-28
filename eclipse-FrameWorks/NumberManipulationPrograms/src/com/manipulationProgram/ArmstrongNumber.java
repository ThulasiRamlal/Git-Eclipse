package com.manipulationProgram;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Number.....");
		int num=scan.nextInt();
		armstrong(num);
		
	}

	public static void armstrong(int num)
	{
		int i=num;
		int arm=0;
		while(num>0)
		{
			int rem=num%10;
			arm=arm+(rem*rem*rem);
			num=num/10;
		}
		if(i==arm)
		{
			System.out.println(arm+" is ARMTRONG NUMBER.....");
		}
		else
		{
			System.out.println(arm+" is NOT ARMTRONG NUMBER.....");
		}
	}
}
