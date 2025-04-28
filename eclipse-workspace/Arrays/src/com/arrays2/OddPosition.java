package com.arrays2;

public class OddPosition {
	public static void main(String[] args) {
		int [] arr= {22,33,44,55,66,77,88,99,00,11};
		//fetching the input data
		System.out.println("printing input: ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" ");
		}
		System.out.println();
		//fetching the dat in ODD posiiton
		for(int i=0;i<arr.length;i=i+2)
		{
			System.out.println(arr[i]+" ");
		}
	}

}
