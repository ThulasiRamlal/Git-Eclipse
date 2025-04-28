package com.comparator;

import java.util.Comparator;

public class Employee 
{
	String name;
    int age;
    int marks;
    
   
	public Employee(String name, int age, int marks) {
		super();
		this.name = name;
		this.age = age;
		this.marks = marks;
	}


	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", marks=" + marks + "]";
	}

}

//Employee class1
class Employee2 implements Comparator<Employee>
{
	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.age-o2.age;
	}

}

class Employee3 implements Comparator<Employee>{
	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.marks-o2.marks;
	}
	
}

