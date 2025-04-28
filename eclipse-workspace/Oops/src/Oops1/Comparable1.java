package Oops1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparable1 implements Comparable<Comparable1>{
	int id;
	int age;
	String name;
	
	Comparable1(int id,int age,String name)
	{
		this.id=id;
		this.age=age;
		this.name=name;
	}
	public String toString()
	{
		return("id: "+id+" age: "+age+" name: "+name);
	}
	@Override
	public int compareTo(Comparable1 o) {
		// TODO Auto-generated method stub
		return this.id-o.id;
	}
	public static void main(String[] args) {
		List<Comparable1> teja = new ArrayList<Comparable1>();
		teja.add(new Comparable1(2,18,"thulasi"));
		teja.add(new Comparable1(1,17,"Kaveri"));
		teja.add(new Comparable1(3,20,"teja"));
	 Collections.sort(teja);
		System.out.println(teja);
		Comparator<Comparable1> teja2=new Comparator<Comparable1>() {

			@Override
			public int compare(Comparable1 o1, Comparable1 o2) {
				// TODO Auto-generated method stub
				return o1.name.compareTo(o2.name);
			}
			
		};Collections.sort(teja,teja2);
		System.out.println(teja);
	}
	
	
	
	

}
