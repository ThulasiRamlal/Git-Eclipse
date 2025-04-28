package com.exceptionhandling;

public class Bank {

	public void intiateAtm()
	{
		System.out.println("Connection to bank server established");
		try {
			Atm atm=new Atm();
			atm.withdraw();
		}
		catch(Exception e)
		{
			System.out.println("Exception from Atm Reaches Bank");
		}
		System.out.println("Connection to bank Server terminal");
	}
	
}
