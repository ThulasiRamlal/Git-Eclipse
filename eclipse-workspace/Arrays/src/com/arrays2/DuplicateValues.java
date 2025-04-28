package com.arrays2;

import java.util.Scanner;

public class DuplicateValues {
	public static void main(String[] args) {
		//to find duplicate elements
		//Scanner scan=new Scanner(System.in);
		int[] a= {1,1,2,3,44,44,5,5};
		for(int i=0;i<a.length;i++)
		{
		 for(int j=i+1;j<a.length;j++)
		 {
			 if(a[i]==a[j])
			 {
				 System.out.println(a[j]);
			 }
		 }
		}
	}

}
