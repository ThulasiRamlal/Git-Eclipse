package com.comparable;

public class Employee1 implements Comparable<Employee1> {
	//One way shorting of AGE
	String name;
    int age;
    int marks;
    
    Employee1(String name,int age,int marks)
    {
    	this.name=name;
    	this.age=age;
    	this.marks=marks;
    }
    

	@Override
	public String toString() {
		return "Employee1 [name=" + name + ", age=" + age + ", marks=" + marks + "]";
	}


	@Override
	public int compareTo(Employee1 o) {
		// TODO Auto-generated method stub
		return this.age-o.age;
	}
	
	//==================================================================
	

}
