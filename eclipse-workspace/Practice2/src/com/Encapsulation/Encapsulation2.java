package com.Encapsulation;

public class Encapsulation2 {
	private int id;
	private String name;
	private int age;
	private double height;
	private double weight;
	
	 Encapsulation2(int id, String name, int age, double height,double weight)
	{
		this.id=id;
		this.name=name;
		this.age=age;
		this.height=height;
		this.weight=weight;
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
	 public double getHeight()
	 {
		 return height;
	 }
	 public double getWeight()
	 {
		 return weight;
	 }
	 
	 
	 public static void main(String[] args) {
			// TODO Auto-generated method stub
			Encapsulation2 teja = new Encapsulation2(1,"Thulasi",21,5.8,71.32);
			System.out.println(teja.id);
			System.out.println(teja.name);
			System.out.println(teja.age);
			System.out.println(teja.height);
			System.out.println(teja.weight);
		}
}
