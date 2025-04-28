package com.functionalInterface;

import java.util.Scanner;

import com.functionalInterface.FunMain.Predicate;

public class PredicateTest {
	public static void main(String[] args) {
		
	Predicate <Integer> p=(a)->a%2==0;
	System.out.println("Enter Number: ");
	Scanner scan=new Scanner(System.in);
    int n=scan.nextInt();
	System.out.println("Even: "+p.predicate(n));


	

	
	
		
	}

}
