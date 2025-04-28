package com.oops;

public class P1Test {
	public void accept(P1 p)
	{
		p.m1();
		p.m2();
		
		
	}
	public static void main(String[] args) {
		P1Test teja=new P1Test();
		
		teja.accept(new P2());
		P1 teja2=new P2();
		((P2)teja2).m3();
		System.out.println("==========================");
		teja.accept(new P3());
		
		P1 teja3=new P3();
		
		((P3)teja3).m4();
	}

}
