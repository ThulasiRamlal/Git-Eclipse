package com.groupingBy;

public class Employee1 {

	int empId;
	String name;
	String location;
	
	Employee1(int empId,String name,String location)
	{
		this.empId=empId;
		this.name=name;
		this.location=location;
		
	}
	public void setDetails(int empId,String name,String location)
	{
		this.empId=empId;
		this.name=name;
		this.location=location;
	}
	public int getEmpId()
	{
		return empId;
	}
	public String getName()
	{
		return name;
	}
	public String getLocation()
	{
		return location;
	}
/*	public String toString()
	{
		return ("empId: "+empId+" name: "+name+" location: "+location);
	}*/
	@Override
	public String toString() {
		return "Employee1 [empId=" + empId + ", name=" + name + ", location=" + location + "]";
	}
	
}

