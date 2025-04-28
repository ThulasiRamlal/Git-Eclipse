package com.object;

import java.util.Scanner;

public class ObjectCreation {
// object -->>
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a num1: ");
		int num1=scan.nextInt();
		System.out.println("Enter a num2: ");
		int num2 = scan.nextInt();
		ObjectCreation teja =new ObjectCreation();//object one
		ObjectCreation teja2 = new ObjectCreation();//object two
		ObjectCreation teja3 = new ObjectCreation();//object three
		teja.method1(num1, num2);
		teja2.method2(num1, num2);
		teja3.method3(num1, num2);

	}
	public void method1(int num1, int num2) {
		System.out.println("addtion : with calling object one : "+(num1+num2));
	}
	public void method2(int num1, int num2)
	{
		System.out.println("Subtractions: with calling object 2:  "+(num1+num2));
	}
	public void method3(int num1, int num2) {
		System.out.println("Multiplications: with calling object 3:  "+(num1*num2));
	}

}
