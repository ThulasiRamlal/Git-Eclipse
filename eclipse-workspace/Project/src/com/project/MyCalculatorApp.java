package com.project;

public class MyCalculatorApp {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		MyCalculator teja =new MyCalculator();
     System.out.println("------------------inherited method--------------");
		teja.great();
		
		System.out.println("-----------childSpecfic method----------------");
		teja.addition();
		
		System.out.println("-----------------Interface Unimplemented methods-------------");
		teja.addition();
		teja.subtraction();
		teja.multplications();
		teja.division();
		
		

	}

}
