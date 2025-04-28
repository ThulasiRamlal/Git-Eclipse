package com.arrays4.com;

import java.util.Scanner;

public class EvenIndex {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Array Size");
		int[] a=new int[scan.nextInt()];
		System.out.println("Enter "+a.length+" elemnts");
		for(int i=0;i<a.length;i++)
		{
			a[i]=scan.nextInt();
		}
		System.out.println("Printng Original Array");
		for(int j:a)
		{
			System.out.print(j+" ");
		}
		System.out.println();
		System.out.println("Printing only EVEN INdexes");
		for(int i=0;i<a.length;i=i+2)
		{
			System.out.println("index "+i);
			System.out.println(a[i]);
		}
		
	}

}
