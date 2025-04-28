package com.searchingAlogarthim;

public class LinearSearch2Test {
	public void stringSearch(String [] arr,String key)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(key.equalsIgnoreCase(arr[i]))
			{
				System.out.println("Key string found "+i+"th index");
			     return;
			}
		}
		System.out.println("Key String not Found");
	}

}
