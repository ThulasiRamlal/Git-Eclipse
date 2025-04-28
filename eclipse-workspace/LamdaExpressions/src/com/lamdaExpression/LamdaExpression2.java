package com.lamdaExpression;

public class LamdaExpression2 {
	public static void main(String[] args) {
		//LamdaExpression1<Integer> teja=(t)->t%2==0;System.out.println(teja.predicate(3));
	
		//Lamda
		//LamdaExpression1<String> teja=()->"Hello World";System.out.println(teja.predicate());
    // LamdaExpression1<String> teja=(name)->" my name is :"+name;System.out.println(teja.predicate("Ramlal"));
	LamdaExpression1<Integer>teja=a->a*a;System.out.println(teja.predicate(10));
	}

}
