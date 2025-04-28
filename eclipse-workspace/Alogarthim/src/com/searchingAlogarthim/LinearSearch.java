package com.searchingAlogarthim;

import java.util.Scanner;

public class LinearSearch {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter a arry size");
		int [] arr=new int[scan.nextInt()];
		System.out.println("enter a "+arr.length+" elements: ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scan.nextInt();
		}
		
		System.out.println("Enter a Key search: ");
		int key=scan.nextInt();
		
		//===================================
		//Object
		LinearSearchTest teja=new LinearSearchTest();
		teja.linearSearch(arr, key);
		
	}
	
	}



