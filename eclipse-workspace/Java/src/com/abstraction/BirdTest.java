package com.abstraction;

public class BirdTest {
	public static void main(String[] args) {	
	accpet(new SerpantEagle());
	Eagle e = new SerpantEagle();
	((SerpantEagle)e).serpantEagle();
	System.out.println();
	accpet(new GoldenEagle());
	Eagle e1=new GoldenEagle();
	((GoldenEagle)e1).goldenEagle();
	System.out.println("============================");
	BirdTest.accpet(new VegSparrow());
	Sparrow s1=new VegSparrow();
	((VegSparrow)s1).vegSparrow();
System.out.println();
	accpet(new NonVegSparrow());
	Sparrow s2=new NonVegSparrow();
	((NonVegSparrow)s2).nonVegSparrow();
		
		
	}
	public static void accpet(Bird b)
	{
		b.eat();
		b.fly();
			
		
	}

}
