package com.groupingBy;

public class Employee5 {
	int empid;
	String name;
	String location;
	double salary;
	
	Employee5(int empid,String name,String location,double salary)
	{
		this.empid=empid;
		this.name=name;
		this.location=location;
		this.salary=salary;
		
	}

	public int getEmpid() {
		return empid;
	}

	public String getName() {
		return name;
	}

	public String getLocation() {
		return location;
	}

	public double getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Employee5 [empid=" + empid + ", name=" + name + ", location=" + location + ", salary=" + salary + "]";
	}

}
