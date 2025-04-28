package com.arrays1;

import java.util.Arrays;

public class MergingArray {
	public static void main(String[] args) {
		int [] a= {1,2,3,4,5};
		int [] b= {10,20,30,40,50};
		int [] c=new int [a.length+b.length];
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
		//System.out.println(Arrays.toString(c));
		//Fetching the data
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]+" ");
		}
	}

}
