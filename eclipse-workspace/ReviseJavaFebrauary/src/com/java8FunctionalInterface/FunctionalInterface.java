package com.java8FunctionalInterface;

public class FunctionalInterface {
	
	//Predicate
	interface Predicate<Integer>
	{
		
		public boolean predicate(int n);
		
	}
	
	//Supply
	interface Supply<String>
	{
		public String supply();
	}
	
	//Consumer
	
	interface Consumer<Integer>
	{
		public void consumer(int a, int b);
		
	}
	
	//Function
	interface Function<Integer>
	{
		public int function(int a, int b);
	}
	

}
