package com.groupingBy;

public class Employee7 {

	int id;
	String name;
	String location;
	
	
	public Employee7(int id, String name, String location) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
	}
	//===================================================
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getLocation() {
		return location;
	}
	
	//=================================================
	@Override
	public String toString() {
		return "Employee7 [id=" + id + ", name=" + name + ", location=" + location + "]";
	}
	
}
