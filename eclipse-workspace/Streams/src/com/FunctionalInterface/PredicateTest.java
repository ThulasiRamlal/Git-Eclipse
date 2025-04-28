package com.FunctionalInterface;

public class PredicateTest {
public static void main(String[] args) {
	Predicate<Integer>teja=t->t%2==0;
	System.out.println(teja.predicate(5));
	Predicate.display();
}

}
