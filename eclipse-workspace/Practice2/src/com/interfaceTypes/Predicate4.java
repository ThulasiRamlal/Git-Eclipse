package com.interfaceTypes;

import java.util.Arrays;
import java.util.List;

public class Predicate4 {
	public static void main(String[] args) {
		List<Integer> teja1 =Arrays.asList(1,2,3,4,5,6,7,8,9,10) ;
		teja1.stream().filter(name->name%2==0).forEach( i->System.out.println("Print even: "+i));
	System.out.println("------------------------------------------------");
	teja1.stream().filter(name->name%2==1).forEach(odd->System.out.println("odd numbers: "+odd));
	}
	
}
