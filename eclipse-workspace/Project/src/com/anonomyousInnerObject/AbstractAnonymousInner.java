package com.anonomyousInnerObject;

import java.util.Scanner;

public  class AbstractAnonymousInner {
	public static void main(String[] args) {
		AnonomyousInnerObject teja = new AnonomyousInnerObject() {
			@Override
			public void greet() {
				// TODO Auto-generated method stub
				System.out.println("greeet.............");
				
			}

			@Override
			public void takuUserInput() {
				// TODO Auto-generated method stub
				Scanner scan = new Scanner(System.in);
				System.out.println("Enter name");
				String name=scan.next();	
			}	
		};
		
		teja.takuUserInput();
		teja.greet();
	}

}
