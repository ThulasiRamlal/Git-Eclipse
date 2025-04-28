package com.arrays2;

import java.util.Scanner;

public class EvenNumber {
	public static void main(String[] args) {
		int [] arr= {1,11,2,2,3,4,4,5,6,7,8,9,10};
		
		System.out.println("printing input: ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("even position: ");
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				System.out.print(arr[i]+" ");
			}
		}
	}

}
