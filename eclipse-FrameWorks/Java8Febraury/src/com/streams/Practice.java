package com.streams;

import java.security.Identity;
import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Set;import java.util.function.Function;
import java.util.stream.Collectors;

public class Practice {
	public static void main(String[] args) {
		//1
		List<Integer>f=Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12);
		List<Integer>f1=f.stream().filter(s->s%3!=0).map(s->s*2).collect(Collectors.toList());
		
		f1.forEach(s->System.out.print(s));
		System.out.println("======================");
		System.out.println();
		//2)find the maximum number
		List<Integer>m=Arrays.asList(1,3,2,9,4);
		IntSummaryStatistics m1=m.stream().collect(Collectors.summarizingInt(Integer::intValue));
		System.out.println("Max :"+m1.getMax());
		System.out.println("============================");
		//3)FlatMap
		List<List<Integer>>fm=Arrays.asList(Arrays.asList(1,2,3),Arrays.asList(4,5,6),Arrays.asList(7,8,9));
		List<Integer>fm2=fm.stream().flatMap(s->s.stream()).collect(Collectors.toList());
		fm2.forEach(s->System.out.println(s));
		System.out.println(fm2);
		System.out.println("================================");
		//Sum OF even Numbers
		List<Integer>sum=Arrays.asList(1,2,3,4,5,8);
		Integer sum1=sum.stream().filter(s->s%2==0).collect(Collectors.summingInt(Integer::intValue));
		System.out.println(sum1);
		System.out.println("=============SUM OF EVEN NUMBERS============");
		IntSummaryStatistics sum3=sum.stream().filter(s->s%2==0).collect(Collectors.summarizingInt(Integer::intValue));
		System.out.println(sum3.getSum());
		
		System.out.println("===============================");
		//Remove Duplicates And Sort
		List<Integer>numbers=Arrays.asList(5,3,1,2,5,3,4);
		Set<Integer>numbers1=numbers.stream().sorted().collect(Collectors.toSet());
	   numbers1.forEach(s->System.out.println(s));
	   System.out.println(numbers1);
	System.out.println("==========================");
	List<Integer>numbers2=numbers1.stream().distinct().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
	System.out.println(numbers2);
	
	System.out.println("==================================");
	
	List<Integer>allMatch=Arrays.asList(1,2,3,4,5);
	Boolean allMatch1=allMatch.stream().allMatch(s->s>0);
    System.out.println(allMatch1); 
    
    System.out.println("======================================");
    List<Integer> allMatch3 = Arrays.asList(1, -2, 3, 4, 5);
	Boolean allMatch4=allMatch3.stream().allMatch(s->s>0);
	System.out.println(allMatch4);
	System.out.println("===================================");
	List<Integer> count = Arrays.asList(1, 2, 2, 3, 3, 3, 4);
	Map<Integer,Long>count2=count.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	System.out.println(count2);
	System.out.println("==================================");
	List<Integer> sos = Arrays.asList(1, 2, 3, 4, 5, 6);
	
	List<Integer>sos1=sos.stream().filter(s->s%2==0).map(s->s*s).collect(Collectors.toList());
	System.out.println(sos1);
	System.out.println("=====================");
	Integer sos3=sos.stream().filter(s->s%2==0).map(s->s*s).collect(Collectors.summingInt(Integer::intValue));
	System.out.println(sos3);
	
	
	}

}
