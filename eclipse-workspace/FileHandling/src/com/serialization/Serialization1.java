package com.serialization;

import java.io.Serializable;

public class Serialization1 implements Serializable {
	String name;
	int age;
	String gender;
	int marks;
	public Serialization1(String name, int age, String gender, int marks) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Serialization1 [name=" + name + ", age=" + age + ", gender=" + gender + ", marks=" + marks + "]";
	}
	

}
