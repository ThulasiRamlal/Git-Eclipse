package com.Exception;
import java.util.Scanner;

public class Matrimony {
	public void matrimony() 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Welcome to matrimony App");
		int uid=123;
		int upwd=123;
		System.out.println("enter USER ID and PASSWORD ");
		int id=scan.nextInt();
		int pwd=scan.nextInt();
	
		if((uid==id)&&(id==pwd))
		{
			System.out.println("SUCCESFULL FOR REGISTER FOR MARRIAGE");
		}
		else
		{
			InvalidUserIdPwdException e=new InvalidUserIdPwdException();
			e.printStackTrace();
		}
		
	}

}
