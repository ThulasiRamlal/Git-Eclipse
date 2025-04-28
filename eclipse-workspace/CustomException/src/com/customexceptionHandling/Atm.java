package com.customexceptionHandling;
import java.util.Scanner;

public class Atm {

	public void withdraw()
	{
		Scanner scan=new Scanner(System.in);
		int uid=1111;
		int upwd=2222;
		System.out.println("Enter UserId");
		int id=scan.nextInt();
		System.out.println("Enter UserPassword");
		int pwd=scan.nextInt();
		if(uid==id&&upwd==pwd)
		{
			System.out.println("Collect Your Money");
		}
		else
		{
			InvalidUserOrPwdException i=new InvalidUserOrPwdException();
			System.out.println(i.getMessage());
		}
	}
}
