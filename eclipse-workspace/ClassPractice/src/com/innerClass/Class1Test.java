package com.innerClass;

public class Class1Test {

public static void main(String[] args) {
	Class1 teja= new Class1();
	teja.id=180434;
	teja.name="Ramlal";
	System.out.println("id: "+teja.id+" name: "+teja.name);
	Class1.Class2 teja2=teja.new Class2();
	teja2.village="Patheplaem";
	teja2.city="Chittor";
	System.out.println(" village: "+teja2.village+" city: "+teja2.city);
	System.out.println("=============================");
System.out.println("id: "+teja.id+" name: "+teja.name+" village: "+teja2.village+" city: "+teja2.city);   
}
}
