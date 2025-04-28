package com.interfaceTypes;

import java.util.Scanner;

public class Function2 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter i: ");
	int a=scan.nextInt();
	System.out.println("Enter j: ");
	int b=scan.nextInt();
	//Function1<Integer,Integer>teja=(i,j)->i*j;System.out.println(teja.ramlal(10, 20));
	Function1<Integer,Integer> teja=(i,j)->i+j;System.out.println(teja.ramlal(a, b));
}
}
