
package com.lamdaExpression;

import java.util.Scanner;

public class LamdaExpression1App {
	public static void main(String[] args) {
		Scanner scan=  new Scanner(System.in);
		System.out.println("Enter a Width");
		int width=scan.nextInt();
	LamdaExpression1 teja = ()->
	System.out.println("Width is a "+width+"cm");teja.method1();
	}
}
