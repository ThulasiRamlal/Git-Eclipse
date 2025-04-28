package com.constructors;

public class Car {
	String colour;
	String brand;
	int cost;
	Car(String colour,String brand,int cost){
		colour=colour;
		brand=brand;
		cost=cost;
	}
	public void display()
	{
		System.out.println("Colour: "+colour+" brand: "+brand+" cost:"+ cost);
	}
			public static void main(String[] args) {
			Car teja=new Car("black","Kia",200000);
			teja.display();
		}

	}
class Car1 {
	String colour;
	String brand;
	int cost;
	Car1(String colour,String brand,int cost)
	{
		this.colour=colour;
		this.brand=brand;
		this.cost=cost;
	}
	public void display()
	{
		System.out.println("Colour: "+colour+" brand: "+brand+" cost:"+ cost);
	}
}

