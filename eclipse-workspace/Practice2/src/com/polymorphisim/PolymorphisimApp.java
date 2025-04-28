package com.polymorphisim;

public class PolymorphisimApp {
	public static void main(String[] args)
	{
		Polymorphisim teja;
		Polymorphisim p1=new Polymorphisim1();  //Upcasting
		Polymorphisim p2 =new Polymorphisim2();  //Upcasting
		method3(p1);
		System.out.println("------------------");
		method3(p2);
		
	}
	public static void method3(Polymorphisim teja)
	{
		teja.method1();
		teja.method2();
	}
	

}
