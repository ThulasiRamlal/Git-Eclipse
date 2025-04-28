package com.singleDimensionalArrays;
import java.util.Scanner;

public class Duplicate {
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter SIZE");
		int [] arr=new int [scan.nextInt()];
	    System.out.println("Enter Elements");
	    for(int i=0;i<arr.length;i++)
	    {
	    	arr[i]=scan.nextInt();
	    }
	    System.out.println("Fetching ORGINAL Elemnts");
	   for(int i=0;i<arr.length;i++)
	   {
		   System.out.print(arr[i]+" ");
	   }
	    System.out.println();
	    System.out.println("Fetching Duplicate Elements");
	    for(int i=0;i<arr.length;i++)
	    {

	    	for(int j=i+1;j<arr.length;j++)
	    	{
	    		if(arr[i]==arr[j])
	    		{
	    			System.out.println(arr[j]);
	    		}
	    	}
	    }
		
	}
	
	}


