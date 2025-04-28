package com.arrays;

public class AscendingOrder {
	public static void main(String[] args) {
		int a[]= {43,1,44,7,333,65,4444};
		//fetching the Orginal Array
		System.out.println("Fetching the Orginal Array");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		//business Logic for Ascending Order
		for(int i=0;i<a.length-1;i++)
		{
			
			for(int j=0;j<a.length-1;j++)
			{
				
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
				
				
			}
		}
			//fetching elemnts Asecending order
			System.out.println("Fetching the Elements in Ascending order...");
			for(int i=0;i<a.length;i++)
			{
				
				System.out.print(a[i]+" ");
				
			}
			
			
			
			
		
		
		
		
	}

}
