package com.groupingBy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Employee4 {
	public static void main(String[] args) {
		/*List<String>teja=new ArrayList<String>();
		teja.add("mango");
		teja.add("Apple");
		teja.add("Pineapple");
		teja.add("Banana");
		teja.add("Banana");
		teja.add("orange");*/
		List<String>teja=Arrays.asList("mango","Apple","Pineapple","Banana","Banana","orange");
		Map<String,List<String>>teja2=teja.stream().collect(Collectors.groupingBy(a->a));
		System.out.println(teja2);
		System.out.println("=====================");
		//By using Entry Set()
		//for(Entry<String,List<String>> map1:teja.en)
		
		//count
	Map<String, Long>teja3=teja.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(teja3);
	
	}

}
