package com.oops;

public class Encapslation1App {
	public static void main(String[] args) {
		
		Encapsulation1 e=new Encapsulation1();
		//By using Setters method in seting the values for private variables in outside class
		e.setId(1);
		e.setName("Ramlal");
		e.setAge(21);
		e.setMarks(91);
		
	
		
		//by using the getters method getting the private varibale values in the outside classe 
		System.out.println(e.getId());
		System.out.println(e.getName());
		System.out.println(e.getAge());
		System.out.println(e.getMarks());
		System.out.println("=================================");
		
		System.out.println(e.toString());
		
		
	}

}
