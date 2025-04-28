package com.arrays;

import java.util.Scanner;

public class LengthOfArray {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter The Size Of Arayy");
	int n[]=new int[scan.nextInt()];
	for(int i=0;i<n.length;i++)
	{
	System.out.println("Enter The Value "+(i+1)+" index..");
	n[i]=scan.nextInt();
	}
	//fetching the length of Given Array
	
		System.out.println("Array Length: "+n.length);

		
	
		
		
	}

}
