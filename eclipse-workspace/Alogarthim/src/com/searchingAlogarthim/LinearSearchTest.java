package com.searchingAlogarthim;

public class LinearSearchTest {
	public void linearSearch(int [] arr,int key)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(key==arr[i])
			{
				//System.out.println("Key found "+i+" index");
				return ;
			}
			
		}
		
	System.out.println("Key not found");
	}

}
