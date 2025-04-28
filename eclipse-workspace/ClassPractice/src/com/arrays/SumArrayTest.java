package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SumArrayTest {

	public static void main(String[] args) {
		SumArray teja=new SumArray();
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter size");
		int size=scan.nextInt();
		int [] a=new int[size];
		System.out.println(" enter a array");
				for(int i=0;i<=a.length-1;i++)
				{
					a[i]=scan.nextInt();
				}
				System.out.println(Arrays.toString(a));
				System.out.println("==============================");
				teja.display1(a);
			
		
	}
}
