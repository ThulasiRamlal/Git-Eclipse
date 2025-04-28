package com.arrays;

import java.util.Scanner;

public class Demo2 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter a size");
		int size=scan.nextInt();
		String [] a=new String[size];
		System.out.println("enter a names");
		for(int i=0;i<a.length;i++)
		{
			a[i]=scan.next();
		}
		//fetching the data
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Student "+i+" name: "+a[i]);
		}
	
	}

}
