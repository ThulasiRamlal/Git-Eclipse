package com.comparableComparator;

public class Person implements Comparable<Person> {

	//Instance variables
	String name;
	int age;
	
	//Constructor
	public Person(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	
	//To String method...
	
	public String toString()
	{
		return "[ Name:"+name+" age: "+age+" ]";	
		
	}
	
	//CompareTo method 
	
	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		return this.age-o.age;
	}
	
	

}
