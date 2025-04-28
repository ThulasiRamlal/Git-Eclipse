package com.Calculator;

import java.util.Scanner;

public class AdvanceCalculator implements Calculator {
 Scanner scan=new Scanner(System.in);
	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("Enter A : ");
		int a=scan.nextInt();
		System.out.println("Enter B : ");
		int b=scan.nextInt();
		int c=a+b;
		System.out.println("Additions Advance Calulator: "+c);
	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		System.out.println("Enter A : ");
		int a=scan.nextInt();
		System.out.println("Enter B : ");
		int b=scan.nextInt();
		
		int c=a-b;
		System.out.println("Subtractions Advance Calulator: "+c);
		
	}

	@Override
	public void mul() {
		// TODO Auto-generated method stub
		System.out.println("Enter A : ");
		int a=scan.nextInt();
		System.out.println("Enter B : ");
		int b=scan.nextInt();
		int c=a+b;
		System.out.println("Multiplications Advance Calulator: "+c);
		
	}

	@Override
	public void div() {
		// TODO Auto-generated method stub
		System.out.println("Enter A : ");
		int a=scan.nextInt();
		System.out.println("Enter B : ");
		int b=scan.nextInt();
		int c=a/b;
		System.out.println("Division Advance Calulator: "+c);
		
		
	}


}
