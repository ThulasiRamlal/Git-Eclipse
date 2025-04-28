package com.comperator_Comparable;

import java.util.Comparator;

public class Comperator1 {
	int id;
	String name;
	int marks;

Comperator1(int id,String name,int marks)
{
	this.id=id;
	this.name=name;
	this.marks=marks;
}
public String toString()
{
	return ("id: "+id+" name: "+name+" marks: "+marks);	
}
}

//----------------------------------------------------------------

class Comperator3 implements Comparator<Comperator1>{
@Override
public int compare(Comperator1 o1, Comperator1 o2) {
	// TODO Auto-generated method stub
	return o1.id-o2.id;
}
}

//--------------------------------------------------------------------
 class Comperator2 implements Comparator<Comperator1>{
	@Override
	public int compare(Comperator1 o1, Comperator1 o2) {
		// TODO Auto-generated method stub
		return  (o1.marks-o2.marks);
	}
	 
 }
