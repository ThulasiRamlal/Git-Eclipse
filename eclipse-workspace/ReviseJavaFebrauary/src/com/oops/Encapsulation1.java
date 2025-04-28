package com.oops;

public class Encapsulation1 {
	
//def :- it refers to variables and method acting on data and coding together into single unit.
//-Encapsulation hides the current class variables from other classes and then acess through current class methods.
//and it leading to data hiding..
	
//	Pozo class:- (Plane old java Object)
//	it defines a class which contains private variables , Setters and Getters then it is POZO Class
	
	//Private variables
	private int id;
	private String name;
	private int age;
	private int marks;
	
	//Setters :-It is used to setting the values of the variables in outside class
	
	public void setId(int id)
	{
		this.id=id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	public void setMarks(int marks)
	{
		this.marks=marks;
	}
	
	//Getters :- it is used Getting values of variables in outside class
	
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
	public int getMarks()
	{
		return marks;
	}
	
	
	//To String method
	@Override
	public String toString() {
		return "Encapsulation1 [id=" + id + ", name=" + name + ", age=" + age + ", marks=" + marks + "]";
	}
	
	
	
	
	
	
	

}
