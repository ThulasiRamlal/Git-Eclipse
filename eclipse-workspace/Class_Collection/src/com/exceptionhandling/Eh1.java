package com.exceptionhandling;

import java.util.Scanner;

public class Eh1 {
	public static void main(String[] args) {
		System.out.println("Code  execution is started");
		
		Scanner scan=new Scanner(System.in);
		try {
		int a=scan.nextInt();
		int b=scan.nextInt();
	
		float c=a/b;
		System.out.println(c);
		}
		//(Userdefined Exception handling)
		catch(Exception e)
		{
			System.out.println("Condition will be not executed");
			System.out.println("programmer write bad logic");
		}
		
		finally {
			System.out.println("This is is finally block");
		}
	
		System.out.println("Code exectuion is completed");
		
	}

}
