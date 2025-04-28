package com.functionalInterface;

import java.util.Scanner;

import com.functionalInterface.FunMain.Consumer;

public class ConsumerTest {
	
	public static void main(String[] args) {
		
		Consumer<Integer> c=(a)->System.out.println("Multiplication : "+(a*a));
		System.out.println("Enter NUMBER : ");
		Scanner scan=new Scanner(System.in);
		c.consumer(scan.nextInt());
		
		
	}

}
