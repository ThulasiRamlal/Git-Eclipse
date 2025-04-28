package com.streams;

import java.util.Arrays;
import java.util.stream.*;
import java.util.List;

public class Stream3 {
public static void main(String[] args) {
	List<Integer>t=Arrays.asList(1,2,3,4,5,6);
	List<Integer>t1=t.stream().filter(a->a%2==0).collect(Collectors.toList());
t1.forEach(System.out::println);
List<String>t2=Arrays.asList("apple","banan","ram");
List<String>t3=t2.stream().map(a->a.toUpperCase()).collect(Collectors.toList());
t3.forEach(System.out::println);
System.out.println("====================================");
List<String>teja=Arrays.asList("thulasiramlal");
List<String>teja2=teja.stream().distinct().collect(Collectors.toList());
System.out.println(teja2);
}

}
