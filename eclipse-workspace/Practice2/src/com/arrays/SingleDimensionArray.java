package com.arrays;

public class SingleDimensionArray {
	public static void main(String[] args) {
		int[] teja= {1,2,3,4,5,6,7,8,9};
		//System.out.println(teja[0]);
		System.out.println("using for loop...............");
		for(int i=0;i<teja.length;i++)
		{
			System.out.println(teja[i]);
		}
		System.out.println("using while loop...........");
		int i=0;
		while(i<teja.length)
		{
			System.out.println(teja[i]);
			i++;
		}
	}

}
