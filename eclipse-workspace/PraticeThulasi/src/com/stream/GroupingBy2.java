package com.stream;

import java.util.*;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupingBy2 {
	public static void main(String[] args) {
		List<String>teja= Arrays.asList("apple","apple","banana","mango","pineApple","orange","pomagranate","grapes","pupaya","jack");
   //teja.forEach(System.out::println);


   System.out.println(teja);
  //  Map<String, Long>teja4=teja.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	//System.out.println(teja4);
	}

}
