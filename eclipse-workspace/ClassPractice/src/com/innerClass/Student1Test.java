package com.innerClass;

public class Student1Test {
	public static void main(String[] args) {
		
		Student1 teja= new Student1();
		teja.name="thulasi";
		teja.roll=12;
		System.out.println("name: "+teja.name+" roll: "+teja.roll);
	 teja.teja2.age=22;
	 teja.teja2.surname="ramapuram";
	 System.out.println(" age: "+teja.teja2.age+" surname: "+teja.teja2.surname);	
	System.out.println("================================");
	System.out.println(" Surname: "+teja.teja2.surname+" name: "+teja.name+" roll: "+teja.roll+" age: "+teja.teja2.age);
	
	
	}
   
}
