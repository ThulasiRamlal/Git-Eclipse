package com.singleDimensionalArrays;
import java.util.*;

public class OddNumber {
	public void odd(int [] arr)
	{
		
		System.out.println("Fetching the ODD number");
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==1)
			{
				System.out.println(arr[i]);
			}
		}
		
	}

}
