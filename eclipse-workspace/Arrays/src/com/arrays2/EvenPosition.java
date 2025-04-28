package com.arrays2;

public class EvenPosition {
public static void main(String[] args) {
	int [] a= {1,11,22,33,44,55,66,77,88,9,9,10};
	//fetching the user data
	System.out.println("Printing input data");
	for(int i=0;i<a.length;i++)
	{
		System.out.print(a[i]+" ");
	}
	System.out.println();
	System.out.println("Printing Even positon data");
	for(int i=1;i<a.length;i=i+2)
	{
		System.out.println(a[i]+" ");
	}
}
}
