package com.lamdaExpression;

public class LamdaExpression3 {
	public static void main(String[] args) {
		LamdaExpression2 teja=(a,b)->
		{
			String name="Thulasi";
			String name1="Ramlal";
			System.out.println("My name: "+name+" "+name1);
			int c=a+b;
			return c;
		};System.out.println("additions: "+teja.display(10, 20));
	}

}
