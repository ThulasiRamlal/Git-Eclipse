package com.classPractice2;

public class Demo {

}
//----------------------------------------------------------
class Demo1 extends Demo{
	
}
//---------------------------------------------------------
class Demo2{
	//1st method
	void greet()
	{
		System.out.println("Demo2 greet method");
	}
	//2nd method
	Demo display()
	{
		System.out.println("Hello world");
		Demo d=new Demo();
		return d;
	}
	//3rd method
	
	 protected void show()
	{
		System.out.println("hii");
	}
}
//-----------------------------------------------------------
class Demo3 extends Demo2{
	void  greet()
	{
		System.out.println("Demo3 greet method........");
	}
	Demo1 display()
	{
		System.out.println("Demo1 display..............");
		return null;
	}
	public void show()
	{
		System.out.println("Demo3 show method.........");
	}
}
//------------------------------------------------
abstract class Demo4{
	protected abstract void display();
}

class Demo5 extends Demo4{

	@Override
	protected void display() {
		// TODO Auto-generated method stub
		
	}
	
}

//-----------------------------------





















