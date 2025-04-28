package com.comperator_Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparable1 implements Comparable<Comparable1> {
	String name;
	int age;
	//Constructor is same name as class name and does not return any value
	Comparable1(String a,int b)
	{
		this.name=a;
		this.age=b;
	}
	//It's object default method
	public String toString()
	{
		return("Name: "+name+" age: "+age);
	}
	//default Comparable method
	/*
	 * public int compareTo(person o) {
	 * 
	 * }
	 */
	
	public static void main(String[] args) {
		List<Comparable1> teja=new ArrayList<Comparable1>();
		teja.add(new Comparable1("Thulasi",21));
		teja.add(new Comparable1("Teja",24));
		teja.add(new Comparable1("Kaveri",23));
		teja.add(new Comparable1("Nagamma",70));
		teja.add(new Comparable1("Pichaiah",50));
		
		
		Collections.sort(teja);
		System.out.println(teja);
}
	@Override
	public int compareTo(Comparable1 o) {
		// TODO Auto-generated method stub
		
		return this.age-o.age;
	}
	
	
	
	
	
	
	
}
