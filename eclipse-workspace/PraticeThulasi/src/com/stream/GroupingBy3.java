package com.stream;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.*;


public class GroupingBy3 {
	{
		List<String>teja=Arrays.asList("Apple","banana","orange","apple1","orange1");
		//Map<String,Long>teja2=teja.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	//System.out.println(teja2);
		Map<String, List<String>>teja3=teja.stream().collect(Collectors.groupingBy(a->a));
		System.out.println(teja3);
		// Map<String, List<String>>teja3=teja.stream().collect(Collectors.groupingBy(a->a));
	}

}
