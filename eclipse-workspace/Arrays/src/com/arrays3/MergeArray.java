package com.arrays3;

import java.util.Arrays;

public class MergeArray {
	public static void main(String[] args) {
		int [] a= {1,2,34};
		int []b= {4,5,6};
		int [] c=new int[a.length+b.length];
		int ci=0;
		for(int i=0;i<a.length;i++)
		{
			c[ci]=a[i];
					ci++;
		}
		for(int i=0;i<b.length;i++)
		{
			c[ci]=b[i];
			ci++;
		}
		//fetching the array
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]+" ");
		}
		System.out.println();
		System.out.println("===============================");
		System.out.println(Arrays.toString(c));
		
	}

}
