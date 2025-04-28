package com.arrays;

import java.util.Scanner;

public class EvenIndex {
	public static void main(String[] args) {
		
		
		
		//Printing ONlyn Even indexes values
		Scanner scan=new Scanner(System.in);
	  System.out.println("Enter size of ARRAY..");
	  int a[]=new int[scan.nextInt()];
	  for(int i=0;i<a.length;i++)
	  {
		  System.out.println("Enter value in index "+(i+1));
		  a[i]=scan.nextInt();
	  }
	  System.out.println("fetching the ORGINAL ARRAY...");
	  for(int i=0;i<a.length;i++)
	  {
		  System.out.print(a[i]+" ");
	  }
	  
	  //business logic for even index
	  System.out.println();
	  System.out.println("FETCHING EVEN IDEXES VALUES....");
	  for(int i=1;i<a.length;i=i+2)
	  {
		  System.out.print(a[i]+" ");
	  }
	
	
	
	}

}
