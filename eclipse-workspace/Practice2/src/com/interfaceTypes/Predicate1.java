package com.interfaceTypes;

import java.util.Scanner;

public class Predicate1 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter num: ");
		int s=scan.nextInt();
		Predicate<Integer> teja=t->t%2==0;
		{
			
			/*
			 * if(t%2==0) { System.out.println("True"); } else {
			 * System.out.println("false"); }
			 */
			//return false;
		};System.out.println(teja.display(s));
	}

}
