package com.interfaces1;

public class RBIAPP {
	
	public static void main(String[] args) {
		RBI1 teja = new RBI1();
		teja.accept(new SBI());
		System.out.println("------------------------");
		teja.accept(new Axis());
		System.out.println("-------------------");
		teja.accept(new HDFC());
	}

}
