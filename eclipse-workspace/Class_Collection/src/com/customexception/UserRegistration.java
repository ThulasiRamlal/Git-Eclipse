package com.customexception;
import java.util.InputMismatchException;
import java.util.Scanner;

public class UserRegistration {
	public void registration()
	
	{
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your Age");
		try
		{
		int age=scan.nextInt();
		if(age>=21 && age<=45)
		{
			System.out.println("Your are registratioin is succesfull for married");
			System.out.println("After married Be carefull with Wife");
		}
		else if(age<=21)
		{
			UnderAgeException uae=new UnderAgeException();
			
			System.out.println(uae.getMessage());
			System.out.println("Your are registratioin not succesfull for married");
			System.out.println("Adjust with love");
			
		}
		else
		{
			OverAgeException oae=new OverAgeException();
			
			System.out.println(oae.getMessgae());
			System.out.println("In future Your never get married");
			System.out.println("Enjoy your single life without any marriage");
		}
	}
	catch(InputMismatchException e)
	{
		System.out.println("Please give vaid input....");
	}
	
	}
}

}
