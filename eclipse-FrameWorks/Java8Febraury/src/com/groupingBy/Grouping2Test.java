package com.groupingBy;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Grouping2Test {
	public static void main(String[] args) {
		
		List<Grouping2> g=new ArrayList<Grouping2>();
		g.add(new Grouping2(1,"Thulasi",21,2000));
		g.add(new Grouping2(2,"Kaveri",22,10000));
		g.add(new Grouping2(3,"Teja",23,50000));
		g.add(new Grouping2(4,"Kaveri",25,100));
		g.add(new Grouping2(5,"suguna",25,200));
//		
//		Map<String, List<Grouping2>>g2=g.stream().collect(Collectors.groupingBy(s->s.getName()));
//		System.out.println(g2);
	System.out.println("======GroupingBy age===");
	Map<Integer, List<Grouping2>>g3=g.stream().collect(Collectors.groupingBy(s->s.getAge()));
	
		System.out.println(g3);
		
		
	}
	

}
