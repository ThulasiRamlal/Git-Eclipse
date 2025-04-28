package com.comperator_Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComperatorApp {
	public static void main(String[] args) {
		List<Comperator1> teja= new ArrayList<Comperator1>();
		teja.add(new Comperator1(18,"Thulasi",10));
		teja.add(new Comperator1(11,"kaveri",12));
		teja.add(new Comperator1(12,"teja",13));
		teja.add(new Comperator1(10,"Suguna",19));
		Collections.sort(teja, new Comperator3());
		System.out.println(teja);
		System.out.println("-------------------------------------");
		Collections.sort(teja, new Comperator2());
		System.out.println(teja);
	}

}
