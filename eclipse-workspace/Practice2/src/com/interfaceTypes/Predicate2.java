package com.interfaceTypes;

import java.util.Arrays;
import java.util.List;

public class Predicate2 {
	public static void main(String[] args) {
		List<Integer> list1=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		list1.stream().filter(t->t%2==0).forEach(i-> System.out.println(""
				+ "Even: "+i));
		System.out.println("-------------------------------");
		list1.stream().filter(t->t%2==1).forEach(r->System.out.println("Odd numbers: "+r));
		
	}

}
