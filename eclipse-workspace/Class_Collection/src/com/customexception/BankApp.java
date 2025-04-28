package com.customexception;

public class BankApp {

	public static void main(String[] args) throws Exception
	{
		System.out.println("Connection Established");
		Bank bank =new Bank();
		bank.instiateAtm();
		System.out.println("Connection Terminated");
	}
}
