package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class StreamFunctions2 {
public static void main(String[]args) {
	/*List<Integer>teja=Arrays.asList(1,2,3,4,4,5,6,7,8,9,9);
	List<String>words=Arrays.asList("thulasi","ram");
	//filter
	List<Integer>teja2=teja.stream().filter(a->a%2==0).collect(Collectors.toList());
	//System.out.println(teja2);
    teja2.forEach(System.out::print);
    System.out.println();
    System.out.println("====================================");
    //distinct
    List<Integer>teja3=teja.stream().distinct().collect(Collectors.toList());
    teja3.forEach(System.out::print);
    System.out.println();
    
    System.out.println("=====================================");
    //toLowerCase
    List<String>teja4=words.stream().map(w->w.toUpperCase()).collect(Collectors.toList());
    teja4.forEach(System.out::println);
    */
    
    //
    List<Integer>t=Arrays.asList(1,2,3,4,5,6,7);
    List<Integer>t1=t.stream().filter(a->a%2==0).collect(Collectors.toList());
    System.out.println(t1);
    
    
    
    
    
}
}
