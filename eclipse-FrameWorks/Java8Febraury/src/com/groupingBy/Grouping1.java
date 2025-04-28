package com.groupingBy;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Grouping1 {
	public static void main(String[] args) {
		
		List<String> g=Arrays.asList("Apple","Banana","Mango","Apple","PineApple");
//		Map<String, List<String>>g1=g.stream().collect(Collectors.groupingBy(a->a));
//		System.out.println(g1);
		
		Map<String,Long>g2=g.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(g2);
	}

}
