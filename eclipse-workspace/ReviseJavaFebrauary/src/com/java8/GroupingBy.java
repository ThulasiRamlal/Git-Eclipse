package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupingBy {
	
	public static void main(String[] args) {
		
		List<String> a=Arrays.asList("apple","banana","apple","guava","mango");
		
		Map<String,Long>a1=a.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	
	System.out.print(a1);
	
	
	}
	
	
	

}
