package com.singledimensional;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MergingArray {
	public static void main(String[] args) {
		int[]a= {1,2,3,4,5};
		int[]b= {10,20,30,40,50};
		int[]c=new int[a.length+b.length];
		int c1=0;
		
		for(int i=0;i<a.length;i++)
		{
			c[c1]=a[i];
			c1++;
		}
		for(int i=0;i<b.length;i++)
		{
			c[c1]=b[i];
			c1++;		}
	System.out.println(Arrays.toString(c));
	}

}
