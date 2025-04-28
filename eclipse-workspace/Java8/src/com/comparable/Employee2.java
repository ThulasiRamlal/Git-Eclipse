package com.comparable;

public class Employee2 implements Comparable<Employee2>{
	

	//One way shorting of AGE
	String name;
    int age;
    int marks;
    
    Employee2(String name,int age,int marks)
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
	public int compareTo(Employee2 o) {
		// TODO Auto-generated method stub
		return this.age-o.age;
	}
}
