package com.abstraction;

public interface Parent2 {
	default void display1()
	{
		System.out.println("Default method");
		
	}

	public void parent2();
}
