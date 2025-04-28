package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseTest {
	public static void main(String[] args) {
		Reverse teja=new Reverse();
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a size");
		int size=scan.nextInt();
		System.out.println("enter a array");
		int [] a=new int[size];
		for(int i=0;i<=a.length-1;i++)
		{
			a[i]=scan.nextInt();
		}
		//System.out.println(Arrays.toString(a));
		/*
		 * for(int i=0;i<a.length;i++) { System.out.print(a[i]); }
		 */
		for(int i:a)
		{
			System.out.println(i);
		}
		System.out.println();
		System.out.println("==========================");
//System.out.println(teja.display1(a));
teja.display1(a);
	}

}
