
package com.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {
	public static void main(String[] args) {
		
		List<String>a=Arrays.asList("apple","banana","orange","guava","mango","apple","apple");
//		
//		List<Boolean>a1=a.stream().map(s->s.isEmpty()).collect(Collectors.toList());
//		a1.forEach(System.out::println);
//		System.out.println("==================================");
//		Long b=a.stream().filter(s->s.equals("apple")).count();
//		System.out.println(b);
//		System.out.println("===========================================");
//		
		int a1=a.stream().filter(s->s.equals("guava")).hashCode();
        System.out.println("a1:"+a1);
//		List<Character>d=a.stream().map(s->s.charAt(2)).collect(Collectors.toList());
//		d.forEach(System.out::print);
//		System.out.println();
//		System.out.println("==========================");
//		Boolean f=a.stream().anyMatch(s->s.equals("mango"));
//		System.out.println("f: "+f);
//		System.out.println("====================================================");
//		
//		Boolean g=a.stream().map(s->s.charAt(2)).equals("b");
		
		//List<String> a=List.of("1","2","3","4","thulasi");
		//int sum=a.stream().mapToInt(Integer::parseInt).sum();
//		int sum=a.stream().mapToInt(s->Integer.parseInt(s)).sum();
//	    	System.out.println("sum: "+sum);
//	    	
//	    	System.out.println("=====================");
//	    Double count=a.stream().mapToDouble(s->Double.parseDouble(s)).sum();
//	     System.out.println("count:"+count);
//	     
//	     System.out.println("=============================");
   List<String>last=a.stream().skip(a.size()-1).collect(Collectors.toList());
	    System.out.println("last: "+last);
	    System.out.println("==================================");
	    
	    List<String>a2=a.stream().distinct().map(s->s.toUpperCase()).sorted(Comparator.naturalOrder()).collect(Collectors.toList());
	a2.forEach(System.out::println);
   
	
	
	
	}

}
