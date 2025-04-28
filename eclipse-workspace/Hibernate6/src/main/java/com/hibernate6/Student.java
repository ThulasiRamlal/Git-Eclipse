package com.hibernate6;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Ramlal")
public class Student {
	@Id
	@Column
	private int roll;
	@Column
	private String name;
	@Column
	private String dept;
	@Column
	private int marks;
	
	public void setRoll(int roll)
	{
		this.roll=roll;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setDept(String dept)
	{
		this.dept=dept;
	}
	public void setMarks(int marks)
	{
		this.marks=marks;
	}
	
	public int getRoll()
	{
		return roll;
	}
	public String getName()
	{
		return name;
	}
	public String getDept()
	{
		return dept;
	}
	public int getMarks()
	{
		return marks;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", dept=" + dept + ", marks=" + marks + "]";
	}
	

}
