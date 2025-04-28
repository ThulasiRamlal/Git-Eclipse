package com.mutableStrings;

public class ReverseStringTest2 {

	public  void display(char[] arr2)
	{
		for(char i:arr2)
		{
			System.out.print(i+" ");
			
		}
		System.out.println();
		System.out.println("Reversing the CHAR");
		for(int i=arr2.length-1;i>=0;i--)
		{
			System.out.print(arr2[i]+" ");
		}
	}
}
