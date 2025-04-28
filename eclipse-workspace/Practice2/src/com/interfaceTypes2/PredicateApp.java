package com.interfaceTypes2;

public class PredicateApp { 
	public static void main(String[] args) {
		Predicate<Integer> teja=(t)->{
			if(t%2==0)
			{
				System.out.println("Even number: "+t);
			}
			else
			{
				System.out.println("odd number: "+t);
			}
			return false;
		};teja.predicate(5);
	}

}
