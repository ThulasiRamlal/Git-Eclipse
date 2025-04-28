package com.comperator_Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparator6{
	int id;
	int age;
	String name;
	Comparator6(int id,int age,String name)
	{
		this.id=id;
		this.age=age;
		this.name=name;
	}
	@Override
	public String toString() {
		return "Comparator6 [id=" + id + ", age=" + age + ", name=" + name + "]";
	}
}
	
  class Comparator7 implements Comparator<Comparator6>{

		@Override
		public int compare(Comparator6 o1, Comparator6 o2) {
			// TODO Auto-generated method stub
			return o1.id-o2.id;
		}
		
	}
	class Comparator8 implements Comparator<Comparator6>
	{

		@Override
		public int compare(Comparator6 o1, Comparator6 o2) {
			// TODO Auto-generated method stub
			return o1.age-o2.age;
		}
		
	}
	
	
	
	
	
	

