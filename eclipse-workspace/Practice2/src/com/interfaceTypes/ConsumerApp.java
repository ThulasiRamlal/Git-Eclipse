package com.interfaceTypes;

public class ConsumerApp {
	public static void main(String[] args) {
		Consumer <String> teja=(t)->{
			System.out.println("Hello world: "+t);
		};teja.accept("Thulasi");
	}

}
