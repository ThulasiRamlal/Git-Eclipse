package com.interfaces;

public class Sample4  implements Sample3{

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("Additions");
		
	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
	System.out.println("Subtractions");
	}
	public static void main(String[] args) {
		Sample4 teja =new Sample4();
		teja.add();
		teja.sub();
	}

}
