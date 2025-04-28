package com.polymorphisim2;

public class Calculator {
	public int add(int x,int y)
	{
		return x+y;
		
	}
	public float add (float x,float y)
	{
		return x+y;
	}
	public double add(double x,double y)
	{
		return x+y;
	}
	public int add(int x,int  y,int z)
	{
		return x+y;
	}
	public float add (float x,float y,float z)
	{
		return x+y;
	}
	
	public double add(double x,double y,double z)
	{
		return x+y;
	}
	public double add(int x,float y,double z)
	{
		return x+y+z;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator teja = new Calculator();
		System.out.println(teja.add(10, 10));
		System.out.println(teja.add(10f, 15f));
		System.out.println(teja.add(10, 10));
		System.out.println(teja.add(10, 10, 10));
		System.out.println(teja.add(5f, 5f, 5f));
		

	}
	
}
