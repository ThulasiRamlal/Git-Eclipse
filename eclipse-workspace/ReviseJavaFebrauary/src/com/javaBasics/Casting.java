package com.javaBasics;

public class Casting {
	public static void main(String[] args) {
		casting();
		
	}
	
	public static void casting()
	{
//		//Type casting :- Type casting it is process of convert into one data type to another data type
//		1.implicit casting :- implicity casting is the process of convert into smaller datatype to larger datatype
//		                 - in down casting not happen in datalosses
//		2.Explicit casting :-Explicity it is th process of convert into larger data type smaller datatype.
//		                          -but upcasting might hapend data losses.
//		
		int a=20;
		long b=a;
		System.out.println("Implicity: "+b);
		
		int c=30;
		long d=(long)c;
		System.out.println("Explicity: "+d);
		
		
	}
	

	

}
