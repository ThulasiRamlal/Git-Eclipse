package com.java8FunctionalInterface;

import com.java8FunctionalInterface.FunctionalInterface.Predicate;

public class PredicateImpl {
	
	public static void main(String[] args) {
		
		Predicate<Integer>p=(n)->n%2==0;
		System.out.println(p.predicate(10));
	}

}
