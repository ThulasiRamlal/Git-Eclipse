package com.arrays4.com;
import java.util.Scanner;

public class MaxArray {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
       System.out.println("Enter Array Size ");
       int [] a=new int[scan.nextInt()];
       System.out.println("Enter "+a.length+" elemnts");
       for(int i=0;i<a.length;i++)
       {
    	   a[i]=scan.nextInt();
       }
       System.out.println("Orignal array: ");
       for(int i:a)
       {
    	   System.out.print(i+" ");
       }
       System.out.println();
       System.out.println("Max element in array");
       int max=a[0];
       for(int i=0;i<a.length;i++)
       {
    	  
    	   if(a[i]>max)
    	   {
    		   max=a[i];
    		  
    	   }
    	  
       }
       System.out.println(max);
       
	
	
	}

}
