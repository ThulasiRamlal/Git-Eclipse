package com.Encapsulation;

public class Encapsulation4 {
	//POJO class ----->>Plane old java Object class
	private int age;
	private String name;
	public void setAge(int age)
	{
		this.age=age;
	}
	public int getAge()
	{
		return age;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public static void main(String[] args) {
		Encapsulation4 teja = new Encapsulation4();
		teja.setAge(10);
		teja.setName("Ramlal");
		System.out.println(teja.getAge());
		System.out.println(teja.getName());
	}

}
