package com.oops;

public class Overloading {
public void m1(int a,int b)
{
	System.out.println(a+b);
}
public void m2(int a,int b,int c)
{
	System.out.println(a+b+c);
}
public float m3(int a,float b,int c)
{
	return a+b+c;
}
public static void main(String[] args) {
	Overloading teja=new Overloading();
	teja.m1(10, 10);
	teja.m2(10, 101, 10);
	System.out.println(teja.m3(10, 20220, 20202202
			));
	
}
}
