package com.interfaceTypes;

public class FunctionApp {
	public static void main(String[] args) {
		Consumer <Integer> teja=(t)->System.out.println("Square: "+t*t);;teja.accept(2);
	}

}
