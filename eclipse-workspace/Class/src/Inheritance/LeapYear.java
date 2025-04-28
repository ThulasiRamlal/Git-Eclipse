package Inheritance;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int year =scan.nextInt();
		LeapYear.methodOne(year);

	}
	public static void methodOne(int year)
	{
		if(year%4==0)
		{
			if(year%100!=0 ||year%400==0)
			{
			System.out.println(year+" is a leap year");
			}
			else
			{
				System.out.println(year+" is not leap year");
			}
			
		}
		else
		{
			System.out.println(year+" is not leap year");
		}
		
	}

}
