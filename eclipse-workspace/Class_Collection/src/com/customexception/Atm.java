package com.customexception;
import java.util.Scanner;

public class Atm {
	public void withdraw() throws Exception
	{
		
		int uid=1111;
		int upwd=2222;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your USER ID and PWD");
		int id=scan.nextInt();
		int pwd=scan.nextInt();
		if(id==uid && pwd==upwd)
		{
			System.out.println("Collect Your Money");
		}
		else
		{
			InvaliUserIdOrPwdException e =new InvaliUserIdOrPwdException();
			System.out.println(e.getMessage());
		}
	}

}
