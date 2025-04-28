package com.oops;

public class ConstructorOverloadingApp {
public static void main(String[] args) {
	
	
	ConstructorOverloading c=new ConstructorOverloading(10);
	ConstructorOverloading c1=new ConstructorOverloading(10, "Thulasi");
	ConstructorOverloading c2=new ConstructorOverloading(11, "Ramlal",21);
	ConstructorOverloading c3=new ConstructorOverloading(21, "Kaveri", 22,90);
	
	System.out.println(c.toString());
	System.out.println(c1.toString());
	System.out.println(c2.toString());
	System.out.println(c3.toString());
}
	
	
	
}
