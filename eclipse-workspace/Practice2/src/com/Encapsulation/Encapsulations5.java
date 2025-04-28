package com.Encapsulation;

public class Encapsulations5 {
	private int age;
	private String name;
	Encapsulations5(int age,String name)//constructor
	{
		this.age=age;
		this.name=name;
	}
	public static void main(String[] args) {
		Encapsulations5 teja=new Encapsulations5(10, "Thulasi");//inserting values into constructor
		System.out.println(teja.age);
		System.out.println(teja.name);
	}
	

}
