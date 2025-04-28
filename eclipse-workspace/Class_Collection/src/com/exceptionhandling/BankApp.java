package com.exceptionhandling;

public class BankApp {
	public static void main(String[] args) {
		System.out.println("Main Connection Established");
		Bank bank=new Bank();
		bank.intiateAtm();
		System.out.println("Main Connection terminated");
	}

}
