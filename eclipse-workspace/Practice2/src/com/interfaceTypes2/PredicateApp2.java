package com.interfaceTypes2;

import java.util.Scanner;

public class PredicateApp2 {
public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	System.out.println("enter a Num1: ");
	int num1=scan.nextInt();
	Predicate<Integer> teja=(t)->num1%2==0;{
		System.out.println(teja.predicate(num1));
	};teja.predicate(num1);
	
}
}
