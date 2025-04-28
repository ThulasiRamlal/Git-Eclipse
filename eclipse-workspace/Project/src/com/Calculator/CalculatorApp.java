package com.Calculator;

public class CalculatorApp {
	public static void acceptCalculator(Calculator ref)
	{
		ref.add();
		ref.sub();
		ref.mul();
		ref.div();
	}
	public static void main(String[] args) {
		Calculator ref;
		ref = new SimpleCalculator();
		ref = new AdvanceCalculator();
		ref= new ScientificCalculator();
		//CalculatorApp.acceptCalculator(ref);
		acceptCalculator(ref);
		
	}
		
		
	
}
