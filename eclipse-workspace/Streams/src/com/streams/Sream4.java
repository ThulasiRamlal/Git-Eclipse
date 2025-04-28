package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.*;

public class Sream4 {
	public static void main(String[] args) {
		List<Integer>teja=Arrays.asList(1,2,3,4,5,5,6,7,8,9,10,10,9,8,7,6,5);
		List<String>teja2=Arrays.asList("apple","banana","mango","Grapes","guava","pine apple");
		//filter()
		List<Integer>t2=teja.stream().filter(a->a%2==0).collect(Collectors.toList());
		t2.forEach(System.out::print);
		System.out.println();
		System.out.println("==================================");
	    //distinct()
		List<Integer>t3=teja.stream().distinct().collect(Collectors.toList());
		t3.forEach(System.out::print);
		System.out.println();
		System.out.println("====================================");
		//Limit()
		List<Integer>t4=teja.stream().limit(7).collect(Collectors.toList());
		t4.forEach(System.out::print);
		System.out.println();
		System.out.println("==========================");
		//Skip
		List<Integer>t5=teja.stream().skip(4).collect(Collectors.toList());
		t5.forEach(System.out::print);
		System.out.println();
		System.out.println("===============================");
		//Map()
		List<String>t6=teja2.stream().map(a->a.toLowerCase()).collect(Collectors.toList());
		System.out.print(t6+" ");
		System.out.println();
		System.out.println("======================");
		//sort()
		List<Integer>t7=teja.stream().sorted().collect(Collectors.toList());
	    for(Integer i:t7)
	    {
	    	System.out.print(i+" ");
	    }
	    System.out.println();
	    System.out.println("==========================");
	    //Count()
	    Long t8=teja.stream().collect(Collectors.counting());
	    System.out.println(t8+" ");
	    System.out.println("================================");
	    
	    //Reduce()
	    Integer t9=teja.stream().reduce(0,(a,b)->a+b);
	    System.out.println(t9+" ");
	    System.out.println("==========================");
	    
	    //How to convert List to Set
	    Set<Integer>t10=teja.stream().collect(Collectors.toSet());
	  for(int i:t10)
	  {
		  System.out.print(i+" ");
	  }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
