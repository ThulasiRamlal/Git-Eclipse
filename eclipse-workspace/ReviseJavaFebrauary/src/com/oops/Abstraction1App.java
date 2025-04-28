package com.oops;

public  class Abstraction1App extends Abstraction1 {

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("M2 method from Abstraction 2 class..");
		
	}
	public static void main(String[] args) {
		Abstraction1App a=new Abstraction1App();
		a.m1();
		a.m2();
		
		
		
	}

	
	

}
