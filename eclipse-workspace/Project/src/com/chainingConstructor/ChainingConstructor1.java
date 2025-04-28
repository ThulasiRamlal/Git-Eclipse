package com.chainingConstructor;

public class ChainingConstructor1 extends ChainingConstructor {
	int x;
	int y;
	
	ChainingConstructor1()
	{
		super();
		int x=100;
		int y=200;
	}
	ChainingConstructor1(int x)
	{
		super();
		this.x=x;
	}
	ChainingConstructor1(int x, int y)
	{
		
		super();
		this.x=x;
		this.y=y;
	}
	public void dispaly2()
	{
		System.out.println(a+" "+b+" "+c+" ");
		System.out.println("-----------------------");
		System.out.println(x+" "+y);
	}
	public static void main(String[] args) {
		ChainingConstructor1 teja= new ChainingConstructor1(30);
		teja.dispaly2();
		//teja.display();
	}

}
