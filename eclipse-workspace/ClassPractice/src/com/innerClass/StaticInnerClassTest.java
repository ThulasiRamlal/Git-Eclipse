package com.innerClass;

public class StaticInnerClassTest {

	public static void main(String[] args) {
		StaticInnerClass teja= new StaticInnerClass();
		teja.id=20;
		teja.name="Thulasi";
		System.out.println("id: "+teja.id+" name: "+teja.name);
		// static inner class object
		StaticInnerClass.StaticInnerClass2 teja2=new StaticInnerClass.StaticInnerClass2();
		teja2.age=22;
		teja2.marks=97;
		System.out.println("age: "+teja2.age+" marks: "+teja2.marks);
		System.out.println("=============================");
		System.out.println("id: "+teja.id+" name: "+teja.name+" age: "+teja2.age+" marks: "+teja2.marks);
	}
}
