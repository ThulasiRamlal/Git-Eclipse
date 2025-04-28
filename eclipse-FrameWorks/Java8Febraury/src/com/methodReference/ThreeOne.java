package com.methodReference;

import java.util.Scanner;

public class ThreeOne {
	
	public static String m2(String a)
	{
	return "my name is :"+a;
		
	}
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Three t=ThreeOne::m2;
		System.out.println("ENter Name ");
		String n=scan.next();
		System.out.println(t.m1(n));
		
		
	}

}
