package com.crud;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int id;
	@Column
	private String name;
	@Column
	private int maths;
	@Column
	private int physics;
	@Column
	private int chemistry;
	
	//setters and getters
	
	public void setId(int id)
	{
		this.id=id;
	}
	public void setName(String name)
	{
		this.name=name;
		
	}
	public void setMaths(int maths)
	{
		this.maths=maths;
	}
	public void setPhysics(int physics)
	{
		this.physics=physics;
	}
	public void setChemistry(int chemistry)
	{
		this.chemistry=chemistry;
	}
	
	//getters
	
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	
	public int getMaths()
	{
		return maths;
	}
	public int getPhysics()
	{
		return physics;
	}
	public int getChemistry()
	{
		return chemistry;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", maths=" + maths + ", physics=" + physics + ", chemistry="
				+ chemistry + "]";
	}
	
	
	
}
