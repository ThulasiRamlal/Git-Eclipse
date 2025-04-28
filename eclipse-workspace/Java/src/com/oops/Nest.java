package com.oops;

public class Nest {
	public void port(Birds b) {
		b.eat();
		b.fly();
		Birds c = new Eagle();
		Birds d = new Sparrow();
		((Eagle)c).drink();
		((Sparrow)d).fly1();
				}
}
