package com.arrays1;

import java.util.Arrays;
import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int arr[]=new int[5];
		for(int i=1;i<5;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println(Arrays.toString(arr));
	}

}
