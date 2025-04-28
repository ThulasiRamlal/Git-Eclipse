package com.collections;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupBy1 {
	public static void main(String[] args) {
		List<String>teja=Arrays.asList("apple","Banana","guava","mango","grapes","apple");
		//Map<String, List<String>>teja2=teja.stream().collect(Collectors.groupingBy(a->a));
		//System.out.println(teja2);
	Map<String,Long>teja3=teja.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	System.out.println(teja3);
	}

}
