package com.oops;

public class Main {

	public static void main(String[] args) {
		Main t=new Main();
		
		
		t.port(new Eagle());
		t.port(new Sparrow());
		
	}
	
	public  void port(Birds b) {
		b.eat();
		b.fly();
		Birds c = new Eagle();
		Birds d = new Sparrow();
		((Eagle)c).drink();
		((Sparrow)d).fly1();
				}

}
	
