
package com.groupingBy;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Employee9 {
	public static void main(String[] args) {
		List<String>teja=Arrays.asList("apple","apple","banana","mango","grapes");
	Map<String, List<String>>teja2=teja.stream().collect(Collectors.groupingBy(a->a));
	System.out.println(teja2);
	System.out.println("=================================");
	Map<String, Long>teja3=teja.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	System.out.println(teja3);
	}

}
