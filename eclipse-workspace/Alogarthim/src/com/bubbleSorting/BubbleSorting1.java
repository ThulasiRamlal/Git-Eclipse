package com.bubbleSorting;
import java.util.Scanner;

public class BubbleSorting1 {
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter Array Size");	
    int[] arr=new int[scan.nextInt()];
    System.out.println("Enter "+arr.length+" Elements");
    for(int i=0;i<arr.length;i++)
    {
    	arr[i]=scan.nextInt();
    	
    }
    System.out.println("Orginal Array");
    for(int i:arr)
    {
    	System.out.print(i+" ");
    }
    System.out.println();
    //Logic for Bubble Sorting 
    for(int i=0;i<arr.length-1;i++)
    {
    	for(int j=0;j<arr.length-1-i;j++)
    	{
    		if(arr[j]>arr[j+1])
    		{
    			int temp=arr[j];
    			arr[j]=arr[j+1];
    			arr[j+1]=temp;
    		}
    	}
    }
    System.out.println("After Sorting");
	
	  for(int i:arr) { 
		  System.out.print(i+" "); }
	 
    System.out.println();
    
    
	}

}
