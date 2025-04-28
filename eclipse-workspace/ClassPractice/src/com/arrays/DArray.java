package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DArray {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		/*System.out.println("enter a M size");
		int m=scan.nextInt();
		System.out.println("enter a N size");
		int n=scan.nextInt(); */
		int m=4;
		int n=4;
		int [][]a=new int[m][n];
		System.out.println("enter a sizes");
		for(int i=0;i<=a[i].length-1;i++)
		{
			for(int j=0;j<=a[m].length-1;j++)
			{
				a[m][n]=scan.nextInt();
			}
			
			
		}
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=0;j<=a[m].length-1;j++)
			{
				System.out.println(a[m][n]);
			}
		
		}
	}

}
