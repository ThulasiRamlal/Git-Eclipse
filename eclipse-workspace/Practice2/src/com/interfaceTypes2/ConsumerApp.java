package com.interfaceTypes2;

public class ConsumerApp {
	public static void main(String[] args) {
		Consumer teja=(message)->System.out.println("Hello world"+message);teja.accept("Ramlal");
	}

}
