package com.comperator_Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

public class Comparable4 implements Comparable<Comparable4>  {
	int id;
	String name;
	Comparable4(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	public String toString()
	{
		return("id: "+id+" name: "+name);
	}
	@Override
	public int compareTo(Comparable4 o) {
		// TODO Auto-generated method stub
		return this.id-o.id ;
	}
	public static void main(String[] args) {
		List<Comparable4> teja= new ArrayList<Comparable4>();
		teja.add(new Comparable4(4,"thulasi"));
		teja.add(new Comparable4(5,"Ramlal"));
		teja.add(new Comparable4(2,"Kaveri"));
		
		 // Collections.sort(teja); 
		 // System.out.println(teja);
		  System.out.println("------------------------");
		  Comparator<Comparable4> teja2=new Comparator<Comparable4>()
				  {

					@Override
					public int compare(Comparable4 o1, Comparable4 o2) {
						// TODO Auto-generated method stub
						return o1.name.compareTo(o2.name);
	}	  
	};Collections.sort(teja, teja2);
	System.out.println(teja);
	}
	}
