package com.arrays1;

import java.util.Arrays;

public class EvenNumber {
	public static void main(String[] args) {
		int []a= {11,22,33,44,55,667,77,88};
		System.out.println(Arrays.toString(a));
		//fetching the Input data
		System.out.println("printing the Input: ");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				System.out.print(a[i]+" ");
			}
		}
		
	}

}
