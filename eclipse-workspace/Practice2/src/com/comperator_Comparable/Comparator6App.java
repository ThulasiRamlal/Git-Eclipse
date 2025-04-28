
package com.comperator_Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparator6App {
	public static void main(String[] args) {
		List<Comparator6> teja= new ArrayList<Comparator6>();
		teja.add(new Comparator6(10,21,"Thulasi"));
		teja.add(new Comparator6(8,19,"Kaveri"));
		teja.add(new Comparator6(7,18,"teja"));
		teja.add(new Comparator6(8,25,"Kaveri"));
		System.out.println(" Sorting in ID: ");
		Collections.sort(teja, new Comparator7());
		System.out.println(teja);
		System.out.println("Sorting in Age: ");
		Collections.sort(teja, new Comparator8());
		System.out.println(teja);
		System.out.println("Sort in NAME: ");
		
		Comparator<Comparator6> teja2 = new Comparator<Comparator6>() {

			@Override
			public int compare(Comparator6 o1, Comparator6 o2) {
				// TODO Auto-generated method stub
				return o1.name.compareTo(o2.name);
			}
			
			
		};Collections.sort(teja, teja2);
		System.out.println(teja);
	}
	

}
