package com.controlConstructs;

public class ForLoop {
	public static void main(String[] args) {
		
		//forLoop();
		//whileLoop();
		forWhileLoop();
		
	}
	public static void forLoop()
	{
		//When ever we know how many iteration will happen than we can use for loop it means( where to start and where to stop the loop)
		
		int n=10;
		for(int i=0;i<=n;i++)
		{
			System.out.println(i);
		}
	}
	
	public static void whileLoop()
	{
	//When ever we dont know how many iteration will happen then we can use while loop
		//(where to start we know but we don't know where to end the loop)
		int n=1;
		while(n<10)
		{
			System.out.println(n);
			n++;
	}
		
	}
	
	
	public static void forWhileLoop()
	{
		//do while loop should have execute instruction atleast once
		int i=1;
		do
		{
			System.out.println(i);
			i++;
			
		}
		while(i<=1);
		
		
		
		
		
		
		
		
		
	}
	
	

}
