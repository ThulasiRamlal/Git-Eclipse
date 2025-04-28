package com.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class Streams2 {
public static void main(String[] args) {
	
	List<String>a=List.of("apple","banana","cherry","mango","orange","apple");
	List<String> lowercase=a.stream().map(s->s.toLowerCase()).collect(Collectors.toList());
	System.out.print("lowercase: ");
	lowercase.forEach(System.out::println);
	System.out.println("=================================");
    
	List<String> uppercase=a.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
	uppercase.forEach(System.out::println);
	System.out.println("==========SKIP================");
	
	List<String> skip=a.stream().skip(a.size()-2).collect(Collectors.toList());
	skip.forEach(System.out::println);
	System.out.println("==============distinct==============");
	List<String> duplicate=a.stream().distinct().collect(Collectors.toList());
	System.out.println(duplicate);
	
	System.out.println("========Sorted=============");
	List<String>sort=a.stream().sorted().skip(a.size()-1).collect(Collectors.toList());
	System.out.print(sort);
	
	System.out.println("==============Reverse============");
	List<String>reverse=a.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
	reverse.forEach(System.out::println);
	
System.out.println("=============Limit==========");
List<String>limit=a.stream().distinct().sorted().limit(3).collect(Collectors.toList());
	limit.forEach(System.out::println);
	
	System.out.println("============Convert to LIST to SET=========");
	Set<String>set=a.stream().collect(Collectors.toSet());
	set.forEach(System.out::println);
	
	
	
	
	
	
	
	
	
	
}
}
