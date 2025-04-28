package com.oops;

public class Encapsulation1 {
	protected String surname;
	protected String name;
	
	protected void jp( ) {
		System.out.println("hello jp");
	}
	
	public void setdisplay(String name,String surname)
	{
		this.name=name;
		this.surname=surname;
	}
	
	public String getSurname()
	{
		return surname;
	}
	public String getName()
	{
		return name;
	}
	

}
