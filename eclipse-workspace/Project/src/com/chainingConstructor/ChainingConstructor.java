package com.chainingConstructor;

public class ChainingConstructor {
	int a;
	int b;
	String c;
public ChainingConstructor()
{
	super();
	a=10;
	b=20;
	c="Omkar";
}
public ChainingConstructor(int a,int b)
{
	super();
	this.a=a;
	this.b=b;
}
public ChainingConstructor(int a, int b,String c)
{
	super();
	this.a=a;
	this.b=b;
	this.c=c;
}
public void display()
{
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
}
}
