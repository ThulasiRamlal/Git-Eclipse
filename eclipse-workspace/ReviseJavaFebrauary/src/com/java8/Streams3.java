package com.java8;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Streams3 {
	public static void main(String[] args) {
		
		//1.partioningBy
		System.out.println("=============pationingBy==============");
		List<Integer> p=Arrays.asList(1,2,3,4,5,6,7,8,9);
		Map<Boolean, List<Integer>>p1=p.stream().collect(Collectors.partitioningBy(n->n%2==0));
		System.out.println(p1);
		
		System.out.println("========Counting==========");
		//2.counting()
		Long c=p.stream().collect(Collectors.counting());
		System.out.println(c);
		
		System.out.println("=========SummarinzingInt=================");
		//summarizingInt()
		
		IntSummaryStatistics a=p.stream().collect(Collectors.summarizingInt(b->b.intValue()));
		System.out.println("maximum: "+a.getMax());
		System.out.println("minimum: "+a.getMin());
		System.out.println("counting: "+a.getCount());
		System.out.println("Average: "+a.getAverage());
		System.out.println("Sum: "+a.getSum());
		System.out.println("Overall: "+a);
	
		
		
		
		
		
		
		
		
	}

}
