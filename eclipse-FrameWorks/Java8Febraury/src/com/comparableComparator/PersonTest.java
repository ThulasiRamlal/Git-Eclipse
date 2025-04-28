package com.comparableComparator;

import java.util.ArrayList;
import java.util.Collections;

public class PersonTest {
	
	public static void main(String[] args) {
		ArrayList<Person> p=new ArrayList<Person>();
		p.add(new Person("Thulasi",21));
		p.add(new Person("pichaiah",54));
		p.add(new Person("Kaveri",22));
		p.add(new Person("suguna",43));
		p.add(new Person("Teja",23));
	
		
	Collections.sort(p);
	System.out.println(p);
		
		
	}

}
