package Leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class Problem2 {
	public static void main(String[] args) {
		int[]a= {1,2,3};
		int[]b= {4,5,6};
		int[]c=new int[a.length+b.length];
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
		System.out.println(Arrays.toString(c));
		
		

	}

}
