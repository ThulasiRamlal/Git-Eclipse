package com.enanymousInnerClass;

import java.util.Scanner;

public class EnannymousInnerClassApp {
	
		public static void main(String[] args) {
			EnanymousInnerClass teja= new EnanymousInnerClass() {

				@Override
				public void method1() {
					// TODO Auto-generated method stub
					Scanner scan= new Scanner(System.in);
					System.out.println("enter a name");
					String name=scan.next();
					System.out.println("method1........."+name);
					
				}

				@Override
				public void method2() {
					// TODO Auto-generated method stub
					System.out.println("method2............");
					
				}
			};teja.method1();teja.method2();
		
	}
	}


