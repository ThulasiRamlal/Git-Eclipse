package com.comparatorComparable;

public class Student implements Comparable<Student>{
	
	
	
	int id;
	String name;
	int age;
	int marks;
	
	public Student(int id,String name,int age,int marks)
	{
		this.id=id;
		this.name=name;
		this.age=age;
		this.marks=marks;
	}
	
	
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


	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.id-o.id;
	}


//	@Override
//	public int compareTo(Student o) {
//		// TODO Auto-generated method stub
//		return this.age-o.age;
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
