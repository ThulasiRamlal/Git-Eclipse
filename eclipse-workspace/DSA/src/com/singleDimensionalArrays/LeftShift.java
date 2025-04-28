package com.singleDimensionalArrays;
import java.util.Arrays;
import java.util.Scanner;

public class LeftShift {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Fetching orginal Elements");
		int [] arr={1,2,3,4,5,6,7,8,9};
		System.out.println();
		
		int shift=scan.nextInt();
		for(int i=0;i<shift;i++)
		{
			int firstIndex=arr[0];
			for(int j=arr.length;j>0;j--)
			{
				arr[j]=arr[j+1];
			}
			arr[arr.length-1]=firstIndex;
			
			
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
