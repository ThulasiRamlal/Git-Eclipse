package com.inheritance;

public class MultilevelInheritance {
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
//class 2
// class MultilevelInheritance1
class MultilevelInheritance1 extends MultilevelInheritance{
	public void display3()
	{
		System.out.println("Display3: multiplications: "+(a*b));
	}
	public void display4()
	{
		System.out.println("Display4: Division: "+(b/a));
	}
}

//class 3
//class class MultilevelInheritance2
class MultilevelInheritance2 extends MultilevelInheritance1{
	public void display5() {
		System.out.println("Display4: MultilevelInheritance2");
	}
}



