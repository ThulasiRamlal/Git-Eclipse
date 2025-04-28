package com.groupingBy;

public class Employee2 {
	int id;
	String name;
	int age;
	public  Employee2(int id,String name,int age)
	{
		this.id=id;
		this.name=name;
		this.age=age;
	}
	//Setters
		public void setId(int id) {
			this.id = id;
		}
		public void setName(String name) {
			this.name = name;
		}
		public void setAge(int age) {
			this.age = age;
		}
		//getters
		public int getId() {
			return id;
		}
		public String getName() {
			return name;
		}
		public int getAge() {
			return age;
		}
	@Override
	public String toString() {
		return "Employee2 [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
}
