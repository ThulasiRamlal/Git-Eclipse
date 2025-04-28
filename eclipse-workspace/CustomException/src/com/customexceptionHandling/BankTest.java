package com.customexceptionHandling;

public class BankTest {
	public static void main(String[] args) {
		Bank bank=new Bank();
		System.out.println("Connection Established");
		bank.instiateAtm();
		System.out.println("Connection Terminated");
	}

}
