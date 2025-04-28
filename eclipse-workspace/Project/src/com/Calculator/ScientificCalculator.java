package com.Calculator;

import java.util.Scanner;

public class ScientificCalculator implements Calculator {
		 Scanner scan=new Scanner(System.in);
			@Override
			public void add() {
				// TODO Auto-generated method stub
				
				System.out.println("Enter A : ");
				int a=scan.nextInt();
				System.out.println("Enter B : ");
				int b=scan.nextInt();
				if(a==0||b==0) {
					int c=a+b;
				System.out.println("Additions Scientific Caliculator : "+c);
				}
				else
				{
					int c=a+b;
					System.out.println("Addtions Scientific Caliculator : "+c);
				}
			}

			@Override
			public void sub() {
				// TODO Auto-generated method stub
				System.out.println("Enter A : ");
				int a=scan.nextInt();
				System.out.println("Enter B : ");
				int b=scan.nextInt();
				
				if(a==0||b==0) {
					int c=a-b;
				System.out.println("Subtractions Scientific Caliculator : "+c);
				}
				else
				{
					int c=a-b;
					System.out.println("Subtractions Scientific Caliculator : "+c);
				}
			}
				
			@Override
			public void mul() {
				// TODO Auto-generated method stub
				System.out.println("Enter A : ");
				int a=scan.nextInt();
				System.out.println("Enter B : ");
				int b=scan.nextInt();
				if(a==0||b==0) {
					int c=a*b;
				System.out.println("multiplications is Zero");
				}
				else
				{
					int c=a*b;
					System.out.println("Multiplications Scientific Caliculator : "+c);
				}
			}
			@Override
			public void div() {
				// TODO Auto-generated method stub
				System.out.println("Enter A : ");
				int a=scan.nextInt();
				System.out.println("Enter B : ");
				int b=scan.nextInt();
				if(a==0||b==0) {
					int c=a/b;
				System.out.println("Divisions is infinty");
				}
				else
				{
					int c=a/b;
					System.out.println("Multiplications Scientific Caliculator : "+c);
				}

				
			}


}
