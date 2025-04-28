package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaxArrayTest {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a size");
		int size=scan.nextInt();
		System.out.println("enter a array");
		int [] a=new int[size];
		for(int i=0;i<=a.length-1;i++)
		{
			a[i]=scan.nextInt();
		}
		System.out.println(Arrays.toString(a));
		System.out.println();
		
	
	
	  MaxArray teja=new MaxArray(); 
	  teja.display(a);
	 
	}
}
