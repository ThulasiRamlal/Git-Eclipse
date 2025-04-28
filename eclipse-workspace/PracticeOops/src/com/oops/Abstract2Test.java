package com.oops;

public class Abstract2Test {
	public static void main(String[] args) {
		Abstract2Test teja=new Abstract2Test();
		teja.accept(new Abstract2());
		
		System.out.println("===============================");
		accept2(new Abstract3());
		
	}
	
	public  void accept(Abstract2 ref)
	{
		ref.method();
		ref.methodTwo();
	    ref.methodThree();
	}
	public static void accept2(Abstract3 ref2)
	{
		ref2.method();
		ref2.methodTwo();
		ref2.methodFour();
	}

}
