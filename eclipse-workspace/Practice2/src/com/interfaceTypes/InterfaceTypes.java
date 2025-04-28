package com.interfaceTypes;

public interface InterfaceTypes {


}
interface Predicate<Integer>{
	boolean display(Integer t);
}
interface Supply<t>{
	  String get1();
}
interface Consumer<T>{
	void accept(T t);
}
interface Function<Integer,Intger>{
	int apply( Integer t);
}
