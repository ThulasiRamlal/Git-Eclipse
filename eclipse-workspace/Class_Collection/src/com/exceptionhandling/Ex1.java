package com.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;



public class Ex1 extends Exception  {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Ex1 t=new Ex1();
		int atmnumber=12345;
		int atmpwd=1234;
		System.out.println("Welcome ATM ");
		System.out.println("ATM CONNECTION ESTABLISHED");
		System.out.println("Enter Your ATM number");
		try {
		int atmnumber1=scan.nextInt();
		System.out.println("Enter your PWD number");
		int atmpwd1=scan.nextInt();
	     //accept(atmnumber, atmpwd, atmnumber1, atmpwd1);
		}
		catch(InputMismatchException e)
		{
			System.out.println("You Entered Wrong INput");
			
		}
		t.accept(atmnumber, atmpwd, atmnumber, atmpwd);
	}
	public void accept(int atmnumber, int atmpwd, int atmnumber1, int atmpwd1)
	{
		int c=atmnumber+atmpwd+atmpwd+atmpwd1;
		System.out.println(c);
	}

}
