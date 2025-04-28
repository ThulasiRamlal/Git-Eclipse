package com.polymorphisim2;

import java.util.Scanner;

public class Calculator2 {

	public static void main(String[] args) {
		Calculator2 teja = new Calculator2();
		teja.method1(10, 10);
		teja.method1(10, 10, 10);
		teja.method1(10, 10, 10, 10);
		System.out.println("method4: "+teja.method1(10f, 10f, 10));
		System.out.println("method5: "+method1(10,10,10,10));
	
	}
	public void method1(int a,int b)
	{
		int c=a+b;
		System.out.println("method1: "+c);
	}
	public void method1(int b,int a,int c)
	{
		int c1=(a-b)*c;
		System.out.println("method2: "+c1);
	}
	public void method1(int a,int b,int d,double f)
	{
		int c2=(int) (a+b+d+f);
		System.out.println("method3: "+c2);
	}
	float method1(float x,float y,int z)
	{
		return x+y+z; 
	}
	static int method1(int a,int b,int c,int d)
	{
		return a+b+c+d;
	}
	
	

}
