package com.inheritance;

public class SinglelevelInheritance {
//Inheritence means quring properties and bhevahiours from parent class to child class (or) base class to sub class
	 static int a=10;
	static int b=20;
	public void display1()
	{
		
		System.out.println("Display1: additions:  "+(a+b));
	}
	public void dispaly2()
	{
		System.out.println("Dispaly2: subtractions: "+(b-a));
	}
	public void display4()
	{
		int a=4;
		int b=4;
		System.out.println("Display4: Division: "+(b/a));
	}
}
//-----------------------------------------------------------------------------------------------
//class SinglelevelInheritance1
class SinglelevelInheritance1 extends SinglelevelInheritance{
	
	public void display3()
	{
		System.out.println("Display3: multiplications: "+(a*b));
	}
	public void display4()
	{
		System.out.println("Display4: Division: "+(b/a));
	}
}
