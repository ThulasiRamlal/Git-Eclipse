package com.oops;

public class MobileTest {

	public static void main(String[] args) {
		Mobile m=new Mobile();
		Charger c=new Charger();
		System.out.println("=================Mobile==============");
	m.brand();
	m.color();
	m.cost();
	System.out.println("=============Composition=============");
	m.os.os();
	m.os.ram();
	m.os.rom();
	System.out.println("===========Aggregation==============");
	c.watt();
	c.type();
	
		
		
	}
}
