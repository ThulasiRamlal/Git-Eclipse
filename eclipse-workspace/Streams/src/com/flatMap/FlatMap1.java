package com.flatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap1 {
	public static void main(String[] args) {
		List<List<Integer>>teja=Arrays.asList(Arrays.asList(1,3,5),Arrays.asList(2,4,6));
		List<Integer>teja2=teja.stream().flatMap(List::stream).collect(Collectors.toList());
	System.out.println(teja2);
	teja.forEach(System.out::print);
	}

}
