package com.arrays4.com;
import java.util.Scanner;

public class EvenNumber {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Array Size");
		int a[] =new int[scan.nextInt()];
		System.out.println("Enter a "+a.length+"  Elements");
	   for(int i=0;i<a.length;i++)
	   {
		   a[i]=scan.nextInt();
	   }
	   System.out.println("Printing Orginal Array");
	   for(int i:a)
	   {
		   System.out.print(i+" ");
	   }
	   System.out.println();
	   System.out.println("Even number in Array");
	   for(int i=0;i<a.length;i++)
	   {
		   if(a[i]%2==0)
		   {
			   System.out.print(a[i]+" ");
			   
		   }
	   }
	
	
	}

}
