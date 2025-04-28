package com.FunctionalInterface;

public class SupplyTest {

	public static void main(String[] args) {
		//predicate is such as functional interface which will not passing any argument and returns value
		Supply<Integer>teja=()->System.out.println("hello world");teja.supply();
	};
}
