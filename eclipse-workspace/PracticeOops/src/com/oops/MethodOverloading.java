
package com.oops;

public class MethodOverloading {
	
	public static void main(String[] args) {
		MethodOverloading teja=new MethodOverloading();
		System.out.println("====CompileTime Polymorphisim======");
		System.out.println();
		teja.methodOne(10, 200, 30);
		teja.methodOne(10, 10, 10, 10);
		System.out.println(teja.methodOne(10, 20));
		System.out.println(teja.methodOne(20,40));
		
	}
	public void methodOne(int a,int b,int c)
	{
		int d=a+b+c;
		System.out.println(" first method: "+c);
		
	}
	public void methodOne(int a,int b,int c,int d)
	{
		int e=a*b*c*d;
		System.out.println("second method: "+e);
		
	}
	public float methodOne(float a,float b)
	{
		return a+b;
	}
	public double methodOne(double a,double b)
	{
		return a-b;
	}

}
