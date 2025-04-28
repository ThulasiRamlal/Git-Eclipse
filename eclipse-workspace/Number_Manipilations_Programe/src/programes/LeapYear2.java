package programes;

import java.util.Scanner;

public class LeapYear2 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a year");
		int year = scan.nextInt();
		LeapYear2.leapYear(year);
		
	}
	public static void leapYear(int year)
	{
		if(year%4==0)
		{
			if(year%100!=0  || year%400==0)
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
			System.out.println(year+ " is not leap year");
		}
		
	}

}
