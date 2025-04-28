package com.project;

public class MyCalculator extends Demo implements AbstractCalculator{
	
	void greet2() {
		System.out.println("Hello User");
	}

	@Override
	public void addition() {
		// TODO Auto-generated method stub
		System.out.println("Additions");
		
	}

	@Override
	public void subtraction() {
		// TODO Auto-generated method stub
		System.out.println("Subtractions");
		
	}

	@Override
	public void multplications() {
		// TODO Auto-generated method stub
		System.out.println("Multplications");
		
	}

	@Override
	public void division() {
		// TODO Auto-generated method stub
		System.out.println("Divisions");
		
	}

}
