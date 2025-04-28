package com.searches;

import java.util.Scanner;
public class LinearSearch {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Size");
		int []a=new int[scan.nextInt()];
		System.out.println("Enter Elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=scan.nextInt();
		}
		System.out.println("Original Array");
		for(int i:a)
		{
			System.out.println(i);
		}
		
		System.out.println("Enter Key For Search");
		
		int key=scan.nextInt();
		boolean flag=false;
		for(int i=0;i<a.length;i++)
		{
			if(key==a[i])
			{
				System.out.println("Key found..."+i+" index");
				flag=true;
				
			}
			
		}
		if(flag==false)
		
		{
			System.out.println("Key not found");
		}
	}

}
