package com.Calculator;

public class SimpleCalculator implements Calculator {
	int a=10;
	int b=10;

	@Override
	public void add() {
		// TODO Auto-generated method stub
		int c=a+b;
		System.out.println("Add SimpleCalculator : "+c);
		
	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		int c=a-b;
		System.out.println("Sub SimpleCalculator : "+c);
		
	}

	@Override
	public void mul() {
		// TODO Auto-generated method stub
		int c=a*b;
		System.out.println("Mul SimpleCalculator : "+c);
		
	}

	@Override
	public void div() {
		// TODO Auto-generated method stub
		int c=a/b;
		System.out.println("Div SimpleCalculator : "+c);
		
	}
	

}
