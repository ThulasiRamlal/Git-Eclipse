package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SumArray {

	public void display1(int a[])
	{
		
		
				int sum=0;
				for(int i=0;i<=a.length-1;i++)
				{
					sum=sum+a[i];
					
				}
				System.out.println(sum);
	}


}
