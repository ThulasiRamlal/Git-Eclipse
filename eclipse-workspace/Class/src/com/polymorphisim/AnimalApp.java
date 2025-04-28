package com.polymorphisim;

public class AnimalApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Animal;
		Animal m = new Monkey();
		Animal t = new Tiger();
		Animal d = new Deer();
		method1(m);
		method1(t);
		method1(d);
		
	
	}
	public static void method1(Animal ref) {
		ref.eat();;
		ref.sleep();
		ref.foodHabit();
		
	}
}
