package com.programmes;
import java.util.Scanner;

public class LeapYear3 {
	public static void main(String[] args) {
		LeapYear3 teja= new LeapYear3();
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a year");
		int year=scan.nextInt();
		teja.display(year);
		
	}
	public void display(int year)
	{
		if(year%4==0)
		{
			if((year%400==0)||(year%100!=0)) 
			{
				System.out.println(year+" is leap year");
			}
			else
			{
				System.out.println(year+" not leap year");
			}
				
		}
		else
		{
			System.out.println(year+" : not leap year");
		}
	}

}
