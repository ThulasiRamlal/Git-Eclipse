package com.hibernate7;

import javax.persistence.Entity;

@Entity

public class Ramlal {
	
	private int roll;
	private String name;
	private int marks;
	
	public void setRoll(int roll)
	{
		this.roll=roll;
	}
	public void setName(String name)
	{
		this.name=name;
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
	public int getMarks()
	{
		return marks;
	}

}
