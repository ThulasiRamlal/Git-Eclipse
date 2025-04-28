package com.oops;

public class Poly1APP {
	public static void main(String[] args) {
		Poly1Test pt=new Poly1Test();
		Poly1 p=new Poly1();
		p.animal();
		pt.animal();

		Poly1 p1=new Poly1Test();//Upcasting
		Poly1Test pt1=(Poly1Test)p1;
		
		pt1.animal3();
		
		
	}

}
