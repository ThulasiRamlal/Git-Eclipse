package com.functionalInterface;

public interface FunMain {
	
	//Predicate FunctionalInterface
	
	//Def: Predicate Interface is a type of interface which is passing one Argument And Checks the Condition
	// and return the result .And although it defualt contains test() method.....
	@FunctionalInterface
	public interface Predicate<Integer>
	{
		
		public boolean predicate(int a);
		
	}
	
	
	
	//Supply FunctionalInterface
	//Def: Supply functional Interface Which is not passing any Argument and return The result
	//although and it contains get() method.....
	@FunctionalInterface
	public interface Supply<String>{
		
		public void supply();
		
	}
	
	//Consumer FunctionalInterface
	
	//Def: Consumer Functional Interface which is passing one argument and doesnot return the result....
	
	@FunctionalInterface
	public interface Consumer<integer>
	{
		public void consumer(int a);
		
	}
	
	
	//Function functional Interface

	//Def: Functional interface which is the passing argument and resturn the result...
	
	@FunctionalInterface
	public interface Function<T,R>{
		public int apply(int a);
	}
	
	

}
