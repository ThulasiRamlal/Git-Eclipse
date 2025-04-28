package com.arrays1;

public class duplicateElements {
	public static void main(String[] args) {
		int [] a= {11,22,33,44,44,55,66};
		//fetching the input data
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println(a[j]);
				}
			}
		}
	}

}
