package com.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Practice3 {
	public static void main(String[] args) {
		System.out.println("========= Stream Filtering============");
		//You have a list of integers. Write a stream pipeline to filter out the even numbers, 
		//square them, and collect the result into a List.
		List<Integer>f=Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
	    List<Integer>f1=f.stream().filter(s->s%2!=0).map(s->s*s).collect(Collectors.toList()); 
	  // f1.forEach(a->System.out.println(a));
	System.out.println(f1);
	
	System.out.println("======Stream Map=========");
	//Given a list of names (strings), write a stream pipeline to convert all the names to uppercase 
	//and then sort them in alphabetical order
	List<String>u=Arrays.asList("John", "Jane", "Alice", "Bob");
	List<String>u1=u.stream().map(s->s.toUpperCase()).sorted().collect(Collectors.toList());
	System.out.println(u1);
	
	System.out.println("=====Stream Reduce========");
	//Write a stream pipeline to calculate the sum of the squares of all numbers in a list.
	List<Integer>r=Arrays.asList(1, 2, 3, 4, 5);
	Integer r1=r.stream().map(s->s*s).collect(Collectors.summingInt(Integer::intValue));
	System.out.println(r1);
	
	System.out.println("==== Stream Collecting======");
//	Given a list of integers, write a stream pipeline to find the maximum number in the list.
	//Approach-1
	List<Integer>m=Arrays.asList(10, 20, 30, 40, 50);
	Optional<Integer> m1=m.stream().max(Comparator.naturalOrder());
	m1.ifPresent(s->System.out.println(s));
	//Approach-2
	IntSummaryStatistics m2=m.stream().collect(Collectors.summarizingInt(Integer::intValue));
	System.out.println(m2.getMax());
	
	System.out.println("======Stream Grouping=========");
	//Write a stream pipeline to group a list of strings based on their lengths.
	List<String>g=Arrays.asList("apple", "bat", "ball", "ant", "banana", "pear");
	Map<Integer, List<String>>g1=g.stream().collect(Collectors.groupingBy(String::length));
	System.out.println(g1);
	System.out.println("=====Group Strings by Their First Character\r\n"
			+ "==========");
	//Given a list of strings, write a stream pipeline that groups the strings 
	//by their first character.
	
	List<String> w = Arrays.asList("apple", "ant", "banana", "bat", "ball", "grape");
	Map<Object, List<String>>w1=w.stream().collect(Collectors.groupingBy(s->s.charAt(0)));
	System.out.println(w1);
	
	System.out.println("===Create a List of Square Roots of Odd Numbers====");
	//Given a list of integers, write a stream pipeline that computes the square roots of all 
	//odd numbers and collects them into a list.
	List<Integer> b = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
	Integer b1=b.stream().filter(s->s%2!=0).mapToInt(s->s*s).sum();
	System.out.println(b1);
	
	System.out.println("Check if All Strings in a List Have a Length Greater Than 3");
	//Write a stream pipeline to check if all strings in a list have a length greater than 3.
	List<String> words = Arrays.asList("apple", "banana", "kiwi", "grape");
	List<Integer>words2=words.stream().map(String::length).collect(Collectors.toList());
	System.out.println(words2);
	}

}
