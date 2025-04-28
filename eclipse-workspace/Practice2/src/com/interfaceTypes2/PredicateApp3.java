package com.interfaceTypes2;

import java.util.Arrays;
import java.util.List;

import com.collections.Arraylist;

public class PredicateApp3 {
	public static void main(String[] args) {
	List<Integer> teja=Arrays.asList(1,2,3,4,5,6,7,8,9);
	int t;
	teja.stream().filter(i->i%2==0).forEach(i->System.out.println("Even number: "+i));
	}

}
