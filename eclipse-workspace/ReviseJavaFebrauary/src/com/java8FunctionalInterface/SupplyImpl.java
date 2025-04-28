package com.java8FunctionalInterface;

import com.java8FunctionalInterface.FunctionalInterface.Supply;

public class SupplyImpl {
	
	public static void main(String[] args) {
		
		Supply<String> s=()->"My name is thulasi Ramlal ";
		System.out.println(s.supply());		
	}

}
