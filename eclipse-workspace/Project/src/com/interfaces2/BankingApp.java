package com.interfaces2;

public class BankingApp {
		public static void main(String[] args) {
			Banking1 teja=new Banking1();
			teja.acceptBanks(new Axis());
			System.out.println("-------------------");
			teja.acceptBanks(new Sbi());
			System.out.println("--------------------");
			teja.acceptBanks(new HDFC());
		}
	}

