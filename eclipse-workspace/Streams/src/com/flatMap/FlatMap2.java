package com.flatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap2 {
	public static void main(String[] args) {
		List<List<Integer>>teja=Arrays.asList(Arrays.asList(1,2,3),Arrays.asList(4,5,6));
	List<Integer>teja2=teja.stream().flatMap(a->a.stream()).collect(Collectors.toList());
	System.out.println(teja2);
	System.out.println("=================================");
	teja2.forEach(System.out::println);
	}

}
