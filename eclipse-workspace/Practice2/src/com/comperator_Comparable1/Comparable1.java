package com.comperator_Comparable1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparable1 implements Comparable<Comparable1> {
int id;
String name;
int  age;
Comparable1(int id,String name,int age)
{
	this.id=id;
	this.name=name;
	this.age=age;
}
public String toString()
{
	return("id: "+id+"  name:  "+name+"  age: "+age);
}
@Override
public int compareTo(Comparable1 o) {
	// TODO Auto-generated method stub
	return this.id-o.id;
}
public static void main(String[] args) {
	List<Comparable1> teja= new ArrayList<Comparable1>();
	teja.add(new Comparable1(10,"Thulasi",21));
	teja.add(new Comparable1(9,"kaveri",24));
	teja.add(new Comparable1(7,"Teja",21));
	/*
	 * Collections.sort(teja); System.out.println(teja);
	 */
	Comparator<Comparable1> teja2=new Comparator<Comparable1>() {

		@Override
		public int compare(Comparable1 o1, Comparable1 o2) {
			// TODO Auto-generated method stub
			return o1.name.compareTo(o2.name);
		}
		
		
	};Collections.sort(teja,teja2);System.out.println(teja);
	
}


}
