package com.oops;

public class PolyTest {
	public static void accept(Poly2 ref)
	{
		ref.method1();
		ref.method2();
		ref.method3();
	}
	 public static void main(String[] args) {
	
		PolyTest.accept(new Poly2());
		System.out.println("======================");
		accept2( new Poly3());
		
	 
		 
	}
	 public static void accept2(Poly3 ref3)
	 {
		ref3.method1();
		ref3.method2();
		ref3.method4();
	 }

}
