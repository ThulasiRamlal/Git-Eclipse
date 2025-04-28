package com.singledimensional;

import java.util.Scanner;

public class Problem1 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter value: ");
	int n=scan.nextInt();
	int[] teja=new int[n];
	for(int i=0;i<n;i++)
	{
		teja[i]=scan.nextInt();
	}
	for(int i=0;i<n;i++)
	{
		System.out.print(teja[i]+" ");
	}
}
}
