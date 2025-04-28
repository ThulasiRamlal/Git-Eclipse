package com.comperator_Comparable1;

import java.util.Comparator;

public class Comparator1 {
	int id;
	int age;
	String name;
	
	Comparator1(int id,int age,String name)
	{
		this.id=id;
		this.age=age;
		this.name=name;
	}
	public String toString()
	{
		return ("id: "+id+" age: "+age+" name: "+name);
	}

}
// ------------------Sorting in id-------------
class Comparator2 implements Comparator<Comparator1>{

	@Override
	public int compare(Comparator1 o1, Comparator1 o2) {
		// TODO Auto-generated method stub
		return o1.id-o2.id;
	}
	
}
//-------------------------sorting in age---------------------

class Comparator3 implements Comparator<Comparator1>{

	@Override
	public int compare(Comparator1 o1, Comparator1 o2) {
		// TODO Auto-generated method stub
		return o1.age-o2.age;
	}
	
}
