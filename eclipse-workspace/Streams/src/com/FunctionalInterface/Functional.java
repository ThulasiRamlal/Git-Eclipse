package com.FunctionalInterface;

public interface Functional {

}

@FunctionalInterface
 interface Predicate<Integer>{
	public boolean predicate(int x);
	public static void display() {
		System.out.println("This is static method");
	}
}

@FunctionalInterface
interface Supply<Integer>{
	public void supply();
}

@FunctionalInterface
interface Consumer<String>{
	public void consumer(String a);
	
}

@FunctionalInterface
interface Function<T>{
	public int function(int a);
}