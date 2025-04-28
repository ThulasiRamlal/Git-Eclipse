package com.oops;

public class Interface1App implements Interface,Interface1 {

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		System.out.println("This m3 method from Interface1..");
		
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("this m1 method from Interface..");
		
	}
	
	public void m5() {
		// TODO Auto-generated method stub
		System.out.println("this m5 method from Interface1App..");
		
	}
	
	
	public static void main(String[] args) {
		Interface1App i=new Interface1App();
	
		i.m1();
		Interface.m2();
		i.m3();
		Interface1.m4();
	    i.m5();
	   i.defaultMethod();
	   
		
		
		
		
	}

	
	
	

}
