package com.java8FunctionalInterface;

import com.java8FunctionalInterface.FunctionalInterface.Consumer;

public class ConsumerImpl {

	public static void main(String[] args) {
		
		
		Consumer<Integer>c=(a,b)->System.out.println("Multiplocation: "+a*b);
		c.consumer(10, 20);
		
	}
	
	
	
}
