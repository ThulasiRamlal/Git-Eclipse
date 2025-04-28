package com.polymorphisim1;

public class Teacher extends School{
	//Overidden method
	public void Studying()
	{
		System.out.println("---------------------");
		System.out.println("Teacher: Studying for every one");
	}
	//Child Specfic method
	public static void teaching()
	{
		System.out.println("Teacher: teacher works as teaching for students");
	}

}
