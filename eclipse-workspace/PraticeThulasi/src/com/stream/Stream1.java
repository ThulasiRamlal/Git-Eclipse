package com.stream;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.*;

public class Stream1 {
	public static void main(String[]args)
	{
		//Intermediate Opertions
		
		/* List<Integer>teja=new ArrayList<Integer>();
		teja.add(10);
		teja.add(10);
		teja.add(20);
		teja.add(30);
		teja.add(11);
		teja.add(21);
		teja.add(21);
		//filter()
		List<Integer>teja2=teja.stream().filter(a->a%2==0).collect(Collectors.toList());
		System.out.println(teja2);
		
		System.out.println("==================================");
		//distinct
		List<Integer>teja3=teja.stream().distinct().collect(Collectors.toList());
        System.out.println(teja3);
        System.out.println("====================================");
        
        //sorted
        List<Integer>teja4=teja.stream().sorted().collect(Collectors.toList());
	System.out.println(teja4);
	System.out.println("=========================================");
	
	//Skip
	List<Integer>teja5=teja.stream().skip(3).collect(Collectors.toList());
	teja5.forEach(System.out::println);
	System.out.println("===============================");
	//Limit
	List<Integer>teja6=teja.stream().limit(3).collect(Collectors.toList());
	teja6.forEach(System.out::println); */
	//toLowerCase
List<String>teja7=Arrays.asList("Thulasi","ramlal","teja","Kaveri");
List<String>teja8=teja7.stream().map(a->a.toLowerCase()).collect(Collectors.toList());
	teja8.forEach(System.out::println);
	System.out.println("============================");
	//toUpperCase
	List<String>teja9=teja7.stream().map(a->a.toUpperCase()).collect(Collectors.toList());
	teja9.forEach(System.out::println);
	}

}
