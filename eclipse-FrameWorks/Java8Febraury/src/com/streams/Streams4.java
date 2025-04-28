package com.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams4 {
	public static void main(String[] args) {
		
		System.out.println("=======PARTIONING BY==========");
		List<Integer>p=Arrays.asList(1,2,3,4,5,6,7);
		Map<Boolean, List<Integer>>p1=p.stream().collect(Collectors.partitioningBy(n->n>5));
		System.out.println(p1);
		System.out.println("==============COUNT===================");
		List<String>c=Arrays.asList("one","two","three","four","five");
	     Long c1=c.stream().count();
	     System.out.println(c1);
	     
	     List<String>a=Arrays.asList("one","two","three","four","five","one");
	
	System.out.println("===========SUMMARIZING INT================");
	IntSummaryStatistics s=p.stream().collect(Collectors.summarizingInt(Integer::intValue));
	System.out.println("sum: "+s.getSum());
	System.out.println("count: "+s.getCount());
	System.out.println("Average: "+s.getAverage());
	System.out.println("Max: "+s.getMax());
	System.out.println("Min: "+s.getMin());
	
	System.out.println("==============Mapping====================");
	List<Integer>l=a.stream().collect(Collectors.mapping(String::length, Collectors.toList()));
	System.out.println(l);
	
	System.out.println("============JOINING==================");
	String j=a.stream().collect(Collectors.joining(",", "{", "}"));
	System.out.println(j);
	
//	System.out.println("=============GROUPING BY WITH DOWNSTREAM COLLECTOR==============");
//	Map<Integer,Long>a=a.stream().collect(Collectors.groupingBy(String::Length,Collectors.counting()));
	
	System.out.println("===============CollectAndThen===========");
	
	int size=a.stream().collect(Collectors.collectingAndThen(Collectors.toSet(), Set::size));
	System.out.println(size);
	
	
	}

}
