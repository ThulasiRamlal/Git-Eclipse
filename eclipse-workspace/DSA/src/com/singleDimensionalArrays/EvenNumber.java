package com.singleDimensionalArrays;

import java.util.Scanner;

public class EvenNumber {
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter Size");
	int size=scan.nextInt();
	int [] arr=new int [size];
	System.out.println("Enter ELements ");
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=scan.nextInt();
	}
	for(int i=0;i<arr.length;i++)
	{
		System.out.print(arr[i]+" ");
	}
	System.out.println();
   System.out.println("Printnig EVEN NUMBERS");
   for(int i=0;i<arr.length;i++)
   {
	   if(arr[i]%2==0)
	   {
		   System.out.print(arr[i]+" ");
	   }
   }
	
			
		
	
	}


}