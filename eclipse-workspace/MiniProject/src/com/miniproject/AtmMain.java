package com.miniproject;
import java.util.InputMismatchException;
import java.util.Scanner;

public class AtmMain  {
	private static int Status;
public static void main(String[] args) 
{
	
	
	Scanner scan=new Scanner(System.in);
	int atmnumber=12;
	int atmpwd=12;
	System.out.println("Welcome ATM ");
	System.out.println("ATM CONNECTION ESTABLISHED");
	System.out.println("Enter Your ATM number");

	int atmnumber1=scan.nextInt();
	System.out.println("Enter your PWD number");
	int atmpwd1=scan.nextInt();
	AtmMain.accept(atmnumber, atmpwd, atmnumber1, atmpwd1);
	
	
}
	public static void accept(	int atmnumber1,int atmpwd1,int atmnumber,int atmpwd)
	{
		ATMOperationImpl atml=new ATMOperationImpl();
		Scanner scan=new Scanner(System.in);
		 
	if(atmnumber1==atmnumber && atmpwd1==atmpwd)
	{
	 while(true)
	 {
		
		 System.out.println("1.VIEW BALANCE");
		 System.out.println("2.WITHDRAW");
		 System.out.println("3.DEPOSITED");
		 System.out.println("4.MINISTATEMENT");
		 System.out.println( "5.EXIT");

		 
		 System.out.println("Enter your choice");
		 int choice=scan.nextInt();
		 if(choice==1)
		 {
			 atml.viewBalance();
		 }
		 else if(choice==2)
		 {
			 System.out.println("Enter your Amount For WITHDRAWN");
			 double withdrawn=scan.nextDouble();
			 
			 atml.withDrawn(withdrawn);
			 
		 }
		 else if(choice==3)
		 {
			 System.out.println("Enter Amount For Deposited");
			 double deposit=scan.nextDouble();
			 atml.deposit(deposit);
		 }
		 else if(choice==4)
		 {
			 System.out.println("MiniStateMent");
			 atml.ministatement();
		 }
		 else if(choice==5)
		 {
			 System.out.println("CONNECTION TERMINATED");
			 System.out.println("Collect your ATM card Thank you For Choosing Atm over Bank");
			 

			 System.exit(Status);
		 }
		 else
		 {
			 System.out.println("CONNECTION TERMINATED");
			 System.out.println("Please enter correct choice");
		 }
		 
	 }
	}
		 
	 
	 else
	 {
		 System.out.println("PLEASE ENTER YOUR ATM  NUMBER or PASSWORD");
		 
		 
	 }
	System.out.println("CONNECTION TEMINATED");
	}
}

	



