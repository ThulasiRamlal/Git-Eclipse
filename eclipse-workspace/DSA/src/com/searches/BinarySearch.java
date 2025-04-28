package com.searches;

import java.util.Arrays;

public class BinarySearch {
	public static void main(String[] args) {
		int a[]= {10,9,8,7,677,5,4,3,2,1};
		int key=100;
		boolean flag=false;
		int l=0;
		int h=a.length-1;
		Arrays.sort(a);
	System.out.println(Arrays.toString(a));
	
	  while(l<=h) 
	  { int mid=(l+h)/2; 
	  if(key==a[mid])
	  {
	  System.out.println("Element found...."); 
	  flag =true;
	  break; 
	  } 
	  if(a[mid]<key)
	  { 
		  l=mid+1;
	  
	  } 
	  if(a[mid]>key) 
	  { 
		  h=mid-1; 
	  } 
	  } 
	  if(flag==false) 
	  {
	  System.out.println("Element not found"); 
	  }
	 
	}

}
