 


package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class StreamFunctions1 {
	public static void main(String[] args) {
		List<Integer>teja=Arrays.asList(1,2,3,4,5,6,7,8,9);
		//filter function
		List<Integer> teja2=teja.stream().filter(a->a%2==0).collect(Collectors.toList());
		System.out.println("Even numbers: "+teja2);
		//System.out.println("---------------------");
		//by using method reference
		teja2.forEach(System.out::print);
		System.out.println("==============================");


//odd number by using Filter function in stream

		List<Integer>odd=Arrays.asList(1,2,3,4,5,6,7,8,9);
		System.out.println("Odd number: ");
		List<Integer> odd2=teja.stream().filter(z->z%2==1).collect(Collectors.toList());
		odd2.forEach(System.out::print);
		System.out.println();
		System.out.println("=======================================");
		
//Lower Case
		List<String>Lowercase=Arrays.asList("ThUlasi","raMlal","ramaPUram");
		List<String>Lowercase2=Lowercase.stream().map(s->s.toLowerCase()).collect(Collectors.toList());
		Lowercase2.forEach(System.out::println);
		System.out.println("=======================================");
		
//Uppercase
		List<String>Uppercase=Arrays.asList("thulasi","ramlal","ramapuram");
		List<String>Uppercase2=Uppercase.stream().map(u->u.toUpperCase()).collect(Collectors.toList());
		Uppercase2.forEach(System.out::println);
		System.out.println("==================================");
		
//Distinct
		List<Integer>distinct=Arrays.asList(1,1,2,2,33,44,55,55,66,7,7);
		List<Integer>distinct2=distinct.stream().distinct().collect(Collectors.toList());
		distinct2.forEach(System.out::println);
		System.out.println("==================================");
		
//Sorted();-->It returns the ascending order
		List<String>sorted=Arrays.asList("ramlal","ajith","kaveri","bull");
		List<String>sorted2=sorted.stream().sorted().collect(Collectors.toList());
		System.out.println(sorted2);
		//sorted2.forEach(System.out::print);
		System.out.println("=================================");
	
//Skip
		List<String>skip=Arrays.asList("thulasi","ramlal","ajith","raju","suguna","z");
		List<String>skip2=skip.stream().skip(3).collect(Collectors.toList());
		skip2.forEach(System.out::println);
		System.out.println("===============================");
		
//count
		List<Integer>count=Arrays.asList(1,2,3,4,5,6,7,8,9);
		long count2=count.stream().count();
		System.out.println(count2);
		System.out.println("=====================================");
//limit
		List<Integer>limit=Arrays.asList(1,2,3,4,5,6,7,8,9);
		List<Integer>limit2=limit.stream().limit(3).collect(Collectors.toList());
		limit2.forEach(System.out::println);
		System.out.println("=====================================z");
//Reduce
		List<Integer>reduce=Arrays.asList(1,2,3,4,5,6,7,8);
		Integer reduce2=reduce.stream().reduce(0,(a,b)->a+b);
		System.out.println(reduce2);
				
	
	}
}
