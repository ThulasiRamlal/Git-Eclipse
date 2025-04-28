package com.methodReference;

public class TwoOne {
	
	static int f;
	public static int m2(int a, int b)
	{
//		f=(c*c);
		return a*b;
	}
	
	public static void main(String[]args)
	{
		Two t=TwoOne::m2;
		System.out.println("Multiplication: "+t.m1(10,10));
		
		
	}

}
