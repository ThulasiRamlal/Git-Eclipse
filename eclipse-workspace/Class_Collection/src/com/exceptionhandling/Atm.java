package com.exceptionhandling;
import java.util.Scanner;

public class Atm {
	public void withdraw() throws Exception
	{
	Scanner scan=new Scanner(System.in);
	try {
		
		System.out.println("Connection to User DataBase Established");
		System.out.println("Atm works and Cash will be dispensed is and only if you Divisior");
		System.out.println("Entered Id and pwd for division");
		int id=scan.nextInt();
		int pwd=scan.nextInt();
		int res=id/pwd;
		System.out.println("Collect your "+res+" -RS Cash");
	}
	catch(Exception e)
	{
		System.out.println("Issued Occured in ATM and Resolved in Atm");
		throw e;
	}
	finally {
		System.out.println("Connection to user DataBase");
	}
}
}

	


