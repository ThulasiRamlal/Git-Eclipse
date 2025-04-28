package com.comperator_Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparable3 implements Comparable<Comparable3> {
	int id;
	String name;
	int age;

public Comparable3(int id,String name,int age)
{
	this.id=id;
	this.name=name;
	this.age=age;
}
public String toString()
{
	return ("[id: "+id+"]  [name: "+name+"]  [age: "+age+"]");
}
@Override
public int compareTo(Comparable3 o) {
	// TODO Auto-generated method stub
	return this.id-o.id;
}
public static void main(String[] args) {
	List<Comparable3> teja=new ArrayList<Comparable3>();
	teja.add(new Comparable3(4,"thulasi",19));
	teja.add(new Comparable3(5,"Ramlal",17));
	teja.add(new Comparable3(2,"Kaveri",15));
	Collections.sort(teja);
	System.out.println(teja+" ");

}




}
