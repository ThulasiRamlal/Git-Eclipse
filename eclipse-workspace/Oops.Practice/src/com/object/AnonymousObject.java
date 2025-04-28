package com.object;

public class AnonymousObject {
	//Anynonmous Object-->>it means to create without any reference variable and one time use purpose only.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new AnonymousObject().method1(10, 10);
		new AnonymousObject().method2(10, 4);
		new AnonymousObject().method3(30, 10);
		new AnonymousObject().method4(10, 10);
		
		
	}
	public void method2(int a ,int b)
	{
		System.out.println("Subtraction: "+(a-b));
		
	}
	public void method1(int a,int b)
	{
		System.out.println("addition: "+(a+b));
	}
	public void method3(int a, int b)
	{
		System.out.println("Multiplications: "+(a*b));
	}
	public void method4(int a,int b)
	{
		System.out.println("Division: "+(a/b));
	}


}
