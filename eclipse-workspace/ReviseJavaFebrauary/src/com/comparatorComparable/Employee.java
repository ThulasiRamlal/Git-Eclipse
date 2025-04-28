package com.comparatorComparable;

import java.util.Comparator;

public class Employee {
	int id;
	String name;
	int age;
	int marks;
	
	public Employee(int id,String name,int age,int marks)
	{
		this.id=id;
		this.name=name;
		this.age=age;
		this.marks=marks;
	}
	
	
	
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
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", marks=" + marks + "]";
	}
	
	
	
	//InnerClasses
	//Class1
	class SortId implements Comparator<Employee>
	{

		@Override
		public int compare(Employee o1, Employee o2) {
			// TODO Auto-generated method stub
			return o1.age-o2.age;
		}

		
		
	}
	
	//Class2
//	class SortAge implements Comparator<Employee>
//	{
//
//		
//		
//	}
	
	


}
