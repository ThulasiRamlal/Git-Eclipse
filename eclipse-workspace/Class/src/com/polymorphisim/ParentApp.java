package com.polymorphisim;

public class ParentApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent ref;
		
		
		Child1 c1= new Child1();
		Child2 c2 = new Child2();
		Child3 c3 = new Child3();
		ref = c1;
		ref.display();
		System.out.println("------------------");
		ref =c2;
		c2.display();
		System.out.println("---------------------");
		ref=c3;
		ref.display();
		

	}

}
