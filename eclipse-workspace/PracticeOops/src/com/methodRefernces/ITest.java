package com.methodRefernces;

public class ITest {
	public static void main(String[] args) {
		I teja=ITest::test;
		teja.method1();
	}
	public static void test()
	{
		System.out.println("ITEST test method");
	}

}
