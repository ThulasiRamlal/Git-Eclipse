package com.interfaceTypes;

//import java.util.function.Consumer;

public class Consumer2 {
	public static void main(String[] args) {
		Consumer1<String> teja=(name)-> ("My self : "+name);
		System.out.println(teja.toAccept("Thulasi ramlal"));
	}

}
