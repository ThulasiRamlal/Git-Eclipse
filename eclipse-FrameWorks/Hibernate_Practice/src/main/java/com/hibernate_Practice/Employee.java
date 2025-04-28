package com.hibernate_Practice;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	@Column
	private int id;
	@Column
	private String name;
	@Column
	private double salary;
	@Column
	private String gender;
	
	//Setters 
	public void setId(int id) 
	{
		this.id = id;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public void setSalary(double salary)
	{
		this.salary = salary;
	}
	public void setGender(String gender) 
	{
		this.gender = gender;
	}
	
//  Getters
	public int getId() 
	{
		return id;
	}
	public String getName() 
	{
		return name;
	}
	public double getSalary() 
	{
		return salary;
	}
	public String getGender() 
	{
		return gender;
	}
	
   
	
	
	
	

}
