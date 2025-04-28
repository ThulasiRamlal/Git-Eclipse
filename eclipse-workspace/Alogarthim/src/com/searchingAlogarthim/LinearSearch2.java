package com.searchingAlogarthim;

import java.util.Scanner;

public class LinearSearch2 {
	public static void main(String[] args) {
		
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter array Size");
	String [] arr=new String[scan.nextInt()];
	System.out.println("Enter "+ arr.length+" Strings ");
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=scan.next();
	}
	
	System.out.println("Enter a key String Search");
	String key=scan.next();
	//=============================
	LinearSearch2Test teja=new LinearSearch2Test();
	teja.stringSearch(arr, key);
	
	}

}
