package Oops1;

public class Staticvariable {


	public static void main(String[] args) {
		methodOne();
		new Staticvariable().methodTwo();
		

	}
	///Static variable
	static int x;
	static int y;
	
	
	//Static block
	static
	{
		System.out.println("Inside static block");
		
		  x=10; y=20;
		  System.out.println("Static block  x: "+x);
		  System.out.println("Static block  y: "+y);
		  
		 
	}
	
	//Static method
	public static void methodOne()
	{
		System.out.println("Inside static method");
		System.out.println(x);
		System.out.println(y);
		System.out.println("----------------------------------------------");
		
	}

	
	//non-static variable (or) instance variable
	int b;
	int c;
	//non-Static blocks
	{
		b=10;
		c=20;
		
		
		
	}
	//non-static methods
	public void methodTwo()
	{
		System.out.println("instance variable b :"+b);
		System.out.println("instance variable c :"+c);
		System.out.println("add :4"+(x+y));
		
		
	}
	
	
	

}
