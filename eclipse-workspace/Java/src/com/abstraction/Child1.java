package com.abstraction;

public class Child1 implements Parent1,Parent2 {
	
public static void main(String[] args) {
	Parent1.display();
Child1 c = new Child1();
c.display1();
c.parent1();
c.parent2();
}

	@Override
	public void parent2() {
		// TODO Auto-generated method stub
		System.out.println("parent2 unimplemnted...");
	}

	@Override
	public void parent1() {
		// TODO Auto-generated method stub
		System.out.println("Parent1 unimplemnted.......");
		
	}
	
}
