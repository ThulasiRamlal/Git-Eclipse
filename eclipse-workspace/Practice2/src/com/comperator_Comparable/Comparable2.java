package com.comperator_Comparable;
import java.lang.*;
import java.lang.String;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparable2 implements Comparable<Comparable2> {
	int id;
	String name;
	String gender;
	
	
	Comparable2(int id,String name,String gender)
	{
		this.id=id;
		this.name=name;
		this.gender=gender;
	}
	public String toString()
	{
		return("id: "+id+" name: "+name+" gender: "+gender);
	}
	public static void main(String[] args) {
		List<Comparable2> teja=new ArrayList<Comparable2>();
		teja.add(new Comparable2(10,"Thulasi","Male"));
		teja.add(new Comparable2(8,"Kaveri","Female"));
		teja.add(new Comparable2(7,"teja","Male"));
		teja.add(new Comparable2(8,"Kaveri","Male"));
		Collections.sort(teja);
		System.out.println(teja);
	}
	@Override
	public int compareTo(Comparable2 o) {
		// TODO Auto-generated method stub
		return this.id-o.id;
	}
	
	
	

}
