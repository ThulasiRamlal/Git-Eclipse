package com.oops;

public class AApp {
	public static void main(String[] args) {
//Upcasting :- it is process of creating Child class object and assingng parent type refernce..
//Down casting :- it is process of creating parent class object and assinging child type refernce
		A a=new ATest();//Up casting
		a.m1();
		a.m2();
		System.out.println("==================");
		
		if(a instanceof ATest)
		{
			ATest a3=(ATest)a;
			a3.m3();
		}
			
	}

}
