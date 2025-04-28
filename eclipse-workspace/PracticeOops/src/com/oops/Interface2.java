package com.oops;

public interface Interface2 {
	public void method4();
	public static void method5()
	{
		System.out.println("Interface2 method5");
	}
	 default void method6()
	 {
		 System.out.println("Interface2 method6");
	 }

}
