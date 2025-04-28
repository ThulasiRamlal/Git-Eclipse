package com.groupingBy;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Employee6 {
	public static void main(String[] args) {
		List<String>teja=Arrays.asList("Apple","Ajith","Ajith","banana","Mango","PinaApple","Orange","Pomagranate");
		Map<String, Long>teja2=teja.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	System.out.println(teja2);
	}

}
