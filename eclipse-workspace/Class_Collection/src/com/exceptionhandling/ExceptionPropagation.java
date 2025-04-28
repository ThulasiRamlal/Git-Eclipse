package com.exceptionhandling;

public class ExceptionPropagation {

}
//=============================
class Demo3
{
	public int divide(int a, int b)
	{
		return a/b;
	}
	
}
//=============
class Demo2
{
	public void call2(int x, int y)
	{
		Demo3 demo3=new Demo3();
		System.out.println(demo3.divide(x, y));
	}
}
//=======================
class Demo1
{
	public void call1(int m, int n)
	{
		Demo2 demo2=new Demo2();
		demo2.call2(m, n);
	}
}
