package com.singleDimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class RightShift {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Fetching orginal Elements");
		int [] arr={1,2,3,4,5,6,7,8,9};
		System.out.println();
		
		int shift=scan.nextInt();
		for(int i=0;i<shift;i++)
			
		{
			int firstIndex;
			int right=arr.length;
			
	        for (int j = arr.length - 1; j > 0; j--)
	        {
	            arr[j] = arr[j - 1];
	        }

			arr[0]=right;
			
			
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
