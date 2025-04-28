package com.exceptionhandling;

public class RuntimeError {
	public static void main(String[] args) {
		System.out.println("Connectioin established");
	     add(10,20);
	     System.out.println("Connection terminated");
	}
	public static void add(int a,int b)
	{
		try {
		System.out.println(a+b);
		add(a,b);
	}
		catch(Error e)
		{
			System.out.println("Some error occured");
		}
	}

}
