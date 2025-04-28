package com.oops;

public class InterfaceTest implements Interface1,Interface2 {

	@Override
	public void method4() {
		// TODO Auto-generated method stub
		System.out.println("Interface2 method4");
		
	}

	@Override
	public void method() {
		// TODO Auto-generated method stub
		System.out.println("Interface1 method1");
	}
	public static void main(String[] args) {
		
		Interface1 teja=new InterfaceTest();
		teja.method();
		Interface1.method2();
		teja.method3();
		System.out.println("=========================");
		
		
		Interface2 teja2=new InterfaceTest();
		teja2.method4();
		Interface2.method5();
		teja2.method6();	
		
		
	}


	
	
	

}
