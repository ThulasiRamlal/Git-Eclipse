package com.oops;

public class PolymorphisimTest {
	public static void main(String[] args) {
		Polymorphisim ref=new Polymorphisim2();
		
	accept(new Polymorphisim2());
	
		
	}
	public static void accept(Polymorphisim2 ref)
	{
		ref.methodOne();
		ref.methodThree();
		ref.methodTwo();
	}

}
