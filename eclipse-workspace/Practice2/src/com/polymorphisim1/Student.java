package com.polymorphisim1;

public class Student extends School {

	@Override
	public void Studying() {
		// TODO Auto-generated method stub
		System.out.println("---------------------");
		System.out.println("Student: Students wants studying");
	}
	//child Specfic method
	public static void topper()
	{
		System.out.println(" Student: that student is topper");
	}
	
	

}
