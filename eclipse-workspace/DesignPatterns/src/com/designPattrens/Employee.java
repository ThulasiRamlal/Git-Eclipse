package com.designPattrens;

public class Employee {
	
	String name;
	int age;
	String gender;
	int salary;
	int dependence;
	String type;
	
	


	public Employee(String name, int age, String gender, int salary, int dependence, String type) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.salary = salary;
		this.dependence = dependence;
		this.type = type;
		
	}
	void work()
	{
		System.out.println(name+" "+type+" Employee working...");
	}
	void applyLeave()
	{
		System.out.println(name+" "+type+" employee has leave...");
	}
}
