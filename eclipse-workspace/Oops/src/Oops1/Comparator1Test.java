package Oops1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparator1Test {
	public static void main(String[] args) {
		List<Comparator1> teja= new ArrayList<Comparator1>();
		teja.add(new Comparator1(2,11,"Thulasi"));
		teja.add(new Comparator1(1,18,"Kaveri"));
		teja.add(new Comparator1(3,20,"Teja"));
		Collections.sort(teja, new Comparator2());
		System.out.println(teja);
		System.out.println("----------------------");
		Collections.sort(teja, new Comparator3());
		System.out.println(teja);
		System.out.println("----------------------");
		Comparator<Comparator1> teja2=new Comparator<Comparator1>() {

			@Override
			public int compare(Comparator1 o1, Comparator1 o2) {
				// TODO Auto-generated method stub
				return o1.name.compareTo(o2.name);
			
			}
			
			
		};Collections.sort(teja, teja2);
		System.out.println(teja);
	}

}
