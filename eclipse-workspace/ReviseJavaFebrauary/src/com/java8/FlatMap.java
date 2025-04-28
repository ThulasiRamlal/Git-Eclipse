package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {
	
	public static void main(String[] args) {
		
		List<List<Integer>>a=Arrays.asList(Arrays.asList(1,2,3),Arrays.asList(5,6,7),List.of(8,9,10));
		List<Integer>a1=a.stream().flatMap(s->s.stream()).collect(Collectors.toList());
	System.out.println(a1);
	
	}

}
