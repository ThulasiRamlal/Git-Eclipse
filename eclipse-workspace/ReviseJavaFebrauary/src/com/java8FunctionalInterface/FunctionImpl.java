package com.java8FunctionalInterface;

import java.util.function.Function;

public class FunctionImpl {
	public static void main(String[] args) {
		
		com.java8FunctionalInterface.FunctionalInterface.Function<Integer>f=(a,b)->a*b;
		System.out.println("Multiplication: "+f.function(10, 20));
		
		
		
	}

}
