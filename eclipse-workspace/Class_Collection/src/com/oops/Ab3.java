package com.oops;

public interface Ab3 {
	public void m1();
	public void m2();
	public static void m3()
	{
		System.out.println("Ab3 interface m3 method");
	}
	default void m4()
	{
		System.out.println("Ab3 interface m4 method");
	}

}
