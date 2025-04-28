package com.customexceptionHandling;
import java.util.Scanner;

public class Registration {
	public void registration()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Your Age");
		int age=scan.nextInt();
		if(age>=21 && age<=45)
		{
			System.out.println("You are eligible for marriage");
		}
		else if(age>21)
		{
			UnderAgeException uae=new UnderAgeException();
			System.out.println(uae.getMessage());
		}
		else
		{
			OverAgeException oae=new OverAgeException();
					System.out.println(oae.getMessage());
		}
	}

}
