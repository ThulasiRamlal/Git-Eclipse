package com.superKeyword;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		String name="Casio";	
	}
	
	public void additions()
	
	{
		System.out.println("Parent: Additions Started..");
	}

}
class MyCalculator extends Calculator{
	Scanner scan =new Scanner(System.in);
	String name="Epson";
	void addtions()
	{
		super.additions();
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.println(" child: addtions: "+(a+b));
	}
	void printName() {
		System.out.println(name);
		
	}
	
}
