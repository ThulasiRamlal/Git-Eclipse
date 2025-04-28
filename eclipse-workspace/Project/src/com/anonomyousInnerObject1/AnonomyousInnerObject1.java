package com.anonomyousInnerObject1;

import java.util.Scanner;

public class AnonomyousInnerObject1  {
	public static void main(String[] args) {
		Ramlal teja = new Ramlal() {

			@Override
			public void greet() {
				// TODO Auto-generated method stub
				Scanner scan = new Scanner(System.in);
				System.out.println("enter a name: ");
				String name = scan.next();
				System.out.println("My self is "+name);
				
			}

			@Override
			public void welcome() {
				// TODO Auto-generated method stub
				System.out.println("welcome................");
				
			}
			
		};teja.greet();teja.welcome();
	}
}
interface Ramlal{
	public void greet();
	public void welcome();
}

