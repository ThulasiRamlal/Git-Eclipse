package com.arrays2;

public class DescendingOrder {
	public static void main(String[] args) {
		int [] a= {99,22,101,11,2,34,5};
		//fetchimg the input array
		System.out.println("printing input data: ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		//Descending Logic
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j]<a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
	System.out.println("Ascending order: ");
  //fetching the data Descending order
	for(int i=0;i<a.length-1;i++)
	{
		System.out.print(a[i]+" "
				+ "");
	}
	}

}
