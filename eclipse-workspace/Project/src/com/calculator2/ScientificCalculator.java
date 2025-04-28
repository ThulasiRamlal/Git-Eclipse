package com.calculator2;

public abstract class  ScientificCalculator extends Calculator implements Calculator2 ,Calculator3 {

	@Override
	public void mul() {
		// TODO Auto-generated method stub
		System.out.println("Multiplications");
		
		
	}

	/*
	 * @Override public void div() { // TODO Auto-generated method stub
	 * 
	 * }
	 */
	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("Additions");
		
	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		System.out.println("Subtraction");
		
	}

}
