package com.oops;

public class Ab3test implements Ab3,Ab4 {

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("interface method 1");
		
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("Interface method2");
	}
	
	public static void m3()
	{
		System.out.println("Ab3test interface m3 method");
	}
	
	public static void main(String[] args) {
		Ab3test t=new Ab3test();
		System.out.println("========Ab3 --> Ab3test=========");
		t.m1();
		t.m2();
		m3();
		
		t.m4();
		System.out.println("========Ab4 interface=====");
		t.m5();
		t.m6();
		
	}

	@Override
	public void m5() {
		// TODO Auto-generated method stub
		System.out.println("Ab4 interface m5 method");
		
	}
	

}
