package com.arrays;
import java.util.Scanner;
public class Demo1 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a size");
		int size=scan.nextInt();
		int []arr=new int[size];
		System.out.println("adding values in array");
		
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("Student marks "+i+" by"+arr[i]);
		}
	}

}
