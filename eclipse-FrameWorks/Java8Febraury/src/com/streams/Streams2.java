package com.streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Streams2 {
	public static void main(String[] args) {
		
		//Filter
	List<Integer> f=Arrays.asList(1,2,3,4,5,6,7,8);
	List<Integer>f1=f.stream().filter(a->a%2==0).collect(Collectors.toList());
	f1.forEach(System.out::println);
	f1.forEach(f11->System.out.println(f11));
	System.out.println("=====================================");
	
	//Lowercase
	List<String>l=Arrays.asList("one","Two","three","four");
	List<String>l1=l.stream().map(s->s.toLowerCase()).collect(Collectors.toList());
	l1.forEach(System.out::println);
	System.out.println("======================");
	
	//UpperCase
	List<String>u=Arrays.asList("one","Two","three","four");
	List<String>u1=u.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
	u1.forEach(u2->System.out.print(u2));
	System.out.println();
	System.out.print("=============================");
	
	//distinct
	List<String>d=Arrays.asList("one","Two","three","four","one","five");
    List<String>d1=d.stream().distinct().collect(Collectors.toList());
	d1.forEach(System.out::println);
	
	System.out.println("===============SORTED====================");
	//sorted
	
	List<Integer>s=Arrays.asList(34,5,22,64);	
	List<Integer>s1=s.stream().sorted(Comparator.reverseOrder()).toList();
	s1.forEach(System.out::println);
	System.out.println("================");
	
	//skip
	System.out.println("===================SKIP==========================");
	List<String>sk=Arrays.asList("one","Two","three","four");
	List<String>sk2=sk.stream().skip(2).collect(Collectors.toList());
	sk2.forEach(s12->System.out.println(s12));
	
	System.out.println("==========LIMIT===============");
	List<String>limit=Arrays.asList("one","Two","three","four");
	List<String>limit2=limit.stream().limit(2).collect(Collectors.toList());
	limit2.forEach(System.out::println);
	
	System.out.println("========CONVERTING LIST TO SET===================");
	List<String>set=Arrays.asList("one","two","three","four","one","five");
	Set<String>set1=set.stream().distinct().collect(Collectors.toSet());
	set1.forEach(s34->System.out.println(s34));
	}

}
