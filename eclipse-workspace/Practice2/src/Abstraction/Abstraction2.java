package Abstraction;

import java.util.Scanner;

public class Abstraction2 extends Abstraction1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Abstraction2 teja = new Abstraction2();
		teja.method1();
		teja.method2();
		Scanner scan =new Scanner(System.in);
		System.out.println("enter a and b values");
		int a=scan.nextInt();
		int b=scan.nextInt();
		teja.method3(a, b);
		Abstraction2.method4(a, b);
		

	}

	@Override
	void method1() { //implementation here from abstract method
		// TODO Auto-generated method stub
		System.out.println("Abstraction1 method1");
		System.out.println("---------------------------");
	}
	

	@Override
	void method2() { //implements here from abstract method
		System.out.println("Abstraction1 method2");
		// TODO Auto-generated method stub
		System.out.println("---------------------------");
	}
	
	public void method3(int a, int b) //overridden  method from Abstraction1 class
	{
		super.method3();
		int c=a+b;
		System.out.println("Overridden method : "+c);
		System.out.println("---------------------------");
	}
	public static void method4(int a,int b)//Method Hiding
	{
		int c=a-b;
		System.out.println("Abstarct2 method4 : "+c);
		System.out.println("---------------------------");
	

	}
}
