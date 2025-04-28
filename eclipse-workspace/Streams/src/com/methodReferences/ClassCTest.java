package com.methodReferences;

public class ClassCTest {
	public static void main(String[] args) {
		ClassD teja=new ClassD();
		ClassC teja2=teja::m2;
		//(or)
		ClassC teja3=new ClassD()::m2;
		System.out.println(teja2.m1(10));
		System.out.println(teja3.m1(20));
	}
}
