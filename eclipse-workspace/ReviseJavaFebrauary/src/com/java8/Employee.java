package com.java8;

public class Employee {
	
	int id;
	String name;
	String location;
	int salary;
	
	public Employee(int id,String name, String location,int salary)
	{
		this.id=id;
		this.name=name;
		this.location=location;
		this.salary=salary;
	}
	
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public String getLocation()
	{
		return location;
	}
	public int getSalary()
	{
		return salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", location=" + location + ", salary=" + salary + "]";
	}
	
	
	
}
