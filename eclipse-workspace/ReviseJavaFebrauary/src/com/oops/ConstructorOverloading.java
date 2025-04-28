package com.oops;

public class ConstructorOverloading {

int id;
String name;
int age;
int marks;


 public ConstructorOverloading(int id)

{
	 
this.id=id;	

}

 public ConstructorOverloading(int id, String name)
{
	this.id=id;
	this.name=name;

}
 public ConstructorOverloading(int id,String name, int age)
{

	this.id=id;
	this.name=name;
	this.age=age;
}

 public ConstructorOverloading(int id, String name, int age,int marks)
{

	this.id=id;
	this.name=name;
	this.age=age;
	this.marks=marks;

}

@Override
public String toString() {
	return "ConstructorOverloading [id=" + id + ", name=" + name + ", age=" + age + ", marks=" + marks + "]";
}
 
 






}
