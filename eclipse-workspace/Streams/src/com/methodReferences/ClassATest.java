package com.methodReferences;

public class ClassATest {
	public static void main(String[] args) {
		ClassA teja=ClassB::m2;
		teja.m1(2,3);
	}

}
