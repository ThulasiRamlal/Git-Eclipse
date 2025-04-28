package com.oops;

import java.util.Scanner;

public class Ab2 extends Ab {
	public static void main(String[] args) {
		Ab2 aa=new Ab2();
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter A and B values ");
		int a=scan.nextInt();
		int b=scan.nextInt();
		aa.m1(a, b);
		aa.m2();
		aa.m3(a, b);
		aa.m4(a, b);	
	}

	@Override
	public void m1(int a, int b) {
		// TODO Auto-generated method stub
		
		System.out.println("Addition: "+(a+b));
		
	}

	@Override
	public void m3(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println( "Subtraction: "+(a-b));
		
	}

	@Override
	public void m4(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("Multipliaction: "+(a*b));
	}
	

}
