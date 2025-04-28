package com.oops;

public class Encapsulation1 {
 private String name;
 private int age;
 
 Encapsulation1(String name,int age)
 {
	 this.name=name;
	 this.age=age;
 }
 public String getName()
 {
	 return name;
 }
 public int getAge()
 {
	 return age;
 }
 
 
 @Override
public String toString() {
	return "Encapsulation1 [name=" + name + ", age=" + age + "]";
}
 
 public static void main(String[] args) {
	 Encapsulation1 teja=new Encapsulation1("ramlal",22);
	 
	 System.out.println(teja.toString());
	 System.out.println(teja.getName());
	 System.out.println(teja.getAge());
 }
}
