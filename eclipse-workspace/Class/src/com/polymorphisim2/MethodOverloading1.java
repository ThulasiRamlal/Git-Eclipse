package com.polymorphisim2;

import java.util.Scanner;

public class MethodOverloading1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading1 teja = new MethodOverloading1();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a choice: ");
		String choice = scan.next();
		switch(choice)
		{
		
		case "Add" :
		System.out.println("Enter Value: ");
		int a =scan.nextInt();
		System.out.println("Enter Value: ");
		int b =scan.nextInt();
		teja.method1(a, b);
		break;
		
		case "Sub" :
		System.out.println("Enter Value: ");
		short a2=scan.nextShort();
		System.out.println("Enter Value: ");
		short b2=scan.nextShort();
		teja.method1(a2, b2);
		break;
		
		case "Mul" :
		System.out.println("Enter Value: ");
		float a3 =  scan.nextFloat();
		System.out.println("Enter Value: ");
		Float b3 = scan.nextFloat();
		teja.method1(a3, b3);
		break;
		
		case "Div" :
		System.out.println("Enter Value: ");
		byte a4=scan.nextByte();
		System.out.println("Enter Value: ");
		byte b4 = scan.nextByte();
		teja.method1(a4, b4);
		break;
		
		case "Rem"  :
		System.out.println("Enter Value: ");
		int a5 =scan.nextInt();
		System.out.println("Enter Value: ");
		short b5 =scan.nextShort();
		int d=method1(a5,b5);
		System.out.println(d);
		break;
		
		}

	}
	public void method1(int a,int b)
	{
		int c=a+b;
		System.out.println("Add: "+c);
	}
	public void method1(short a2,short b2)
	{
		short c= (short) (a2-b2);
		System.out.println("Sub: "+c);
	}
	public void method1(float a3, float b3)
	{
		float c= (a3*b3);
		System.out.println("Mul: "+c);
	}
	public void method1(byte a4,byte b4)
	{
		Byte c=(byte) (a4/b4);
		System.out.println("Div: "+c);
	}
	public  static int method1(int a5,short b5)
	{
		short c = (short) (a5%b5);
		return c;
	}

}
