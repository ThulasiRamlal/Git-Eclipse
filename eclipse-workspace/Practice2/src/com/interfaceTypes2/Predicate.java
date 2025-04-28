package com.interfaceTypes2;
@FunctionalInterface
public interface Predicate<I> {
boolean predicate(Integer t);
}

@FunctionalInterface
interface Supply<i>{
	public void get();
}

@FunctionalInterface
interface Consumer<i>{
	public void accept(String message);
	
}

@SuppressWarnings("hiding")
@FunctionalInterface
interface Function<Interger,Integer>{
	public int apply(int i);
}