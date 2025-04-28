package com.comperator_Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorApp2 {
	public static void main(String[] args) {
		List<Comparator2> teja=new ArrayList<Comparator2>();
		teja.add(new Comparator2(4,"thulasi",10));
		teja.add(new Comparator2(5,"Ramlal",17));
		teja.add(new Comparator2(2,"Kaveri",15));
		teja.add(new Comparator2(1,"Teja",1));
		System.out.println("Comparator3 is shorting value in ID");
		Collections.sort(teja,new Comparator4());
		System.out.println(teja);
		System.out.println("--------------------------");
		System.out.println("Comparator4 is shorting value in AGE");
		Collections.sort(teja, new Comparator3());
		System.out.println(teja);
		
	}

}
