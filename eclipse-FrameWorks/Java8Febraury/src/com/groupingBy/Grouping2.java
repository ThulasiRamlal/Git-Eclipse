package com.groupingBy;

public class Grouping2 {
	
	private int id;
	private String name;
	private int age;
	private long salary;
	
	
	public Grouping2(int id, String name, int age, long salary) 
	{
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
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
	public void setSalary(long salary)
	{
		this.salary=salary;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public long getSalary() {
		return salary;
	}
	@Override
	public String toString() {
		return "Grouping2 [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
	

}
