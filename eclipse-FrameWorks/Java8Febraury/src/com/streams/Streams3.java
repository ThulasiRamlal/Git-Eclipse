package com.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Streams3 {
	public static void main(String[] args) {
		
		        // List of strings
		        List<String> stringNumbers = Arrays.asList("1", "2", "6","3", "4", "5","5");

		        // Using Stream with lambda expression to convert string to integers
		        System.out.println("=======CONVERTING TO STRING TO INTEGER===========");
		        List<Integer> numbers = stringNumbers.stream()
		                .map(str -> Integer.parseInt(str)) // Lambda expression for conversion
		                .collect(Collectors.toList()); // Collect the result in a list

		        // Print the result
		        System.out.println(numbers);
		       
	        
		        System.out.println("==========CONVERTING  STRING TO DOUBLE=========== ");
		        List<Double> d=stringNumbers.stream().map(s->Double.parseDouble(s)).collect(Collectors.toList());
		        d.forEach(System.out::println);
		        
		        System.out.println("=============================");
		        List<Double> sum=stringNumbers.stream().
		        		map(s->Double.parseDouble(s)).filter(i->i%2==0).collect(Collectors.toList());
		        sum.forEach(s->System.out.println(s));
		        
		        
		        System.out.println("===========CONVERTING INTEGER TO STRING==============");
		        List<Integer>i=Arrays.asList(1,2,3,4,5);
		        List<String>i1=i.stream().map(s->String.valueOf(s)).collect(Collectors.toList());
		        i1.forEach(System.out::print);
		        System.out.println(i1);
		        
		       System.out.println("=============REVERSE ORDER==================");
		       List<String>reverse=Arrays.asList("one","two","three","four","five","six");
		       List<String>reverse1=reverse.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		        reverse1.forEach(System.out::println);
		        
		        System.out.println("==================================");
	 	        List<Integer>a=stringNumbers.stream().map(s->Integer.parseInt(s)).
	 	        		sorted(Comparator.reverseOrder()).collect(Collectors.toList());
	                System.out.println(a);	
	                System.out.println("=================================");
	              List<String>reverse3=reverse.reversed();  
	System.out.println(reverse3);
	
	System.out.println("========MIN==================");
	List<Integer>min=Arrays.asList(10,2,44,5,11,4,1,199,456);
	Optional<Integer>min1=min.stream().
			min(Comparator.naturalOrder());
	System.out.println(min1);
	
	System.out.println("=======MAX===========");
	Optional<Integer> max=min.stream().
			max(Comparator.naturalOrder());
	System.out.println(max);
	
	System.out.println("====================================");
	Optional<Integer>max1=min.stream().
			max(Comparator.naturalOrder());
	max1.ifPresent(value->System.out.println(value));
	
	System.out.println("=========ALL MATCH================");
	Boolean allMatch=min.stream().allMatch(n->n%2==0);
    System.out.println(allMatch);
   System.out.println(allMatch);
	
   System.out.println("=================ANY MATCH=================");
	Boolean anyMatch=min.stream().
			anyMatch(n->n%2==0);
	System.out.println(anyMatch);
	
	System.out.println("===========NONE MATCH=============");
	Boolean noneMatch=min.stream().
			noneMatch(n->n%2==0);
	System.out.println(noneMatch);
	
	System.out.println("============FIND FIRST===============");
	Optional<Integer> findFirst=min.stream().
			findFirst();
	findFirst.ifPresent(System.out::println);
	
	System.out.println("==============FIND ANY=================");
	Optional<Integer>findAny=min.stream().
			findAny();
	findAny.ifPresent(s->System.out.println(s));
	
	
	
	}
	
	}


