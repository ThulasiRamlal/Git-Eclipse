package com.stringPrograms;
import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter a string");
	String s1=scan.next();
	char[] arr=s1.toCharArray();
	for(int i=0;i<arr.length;i++)
	{
		System.out.print(arr[i]+" ");
	}
	System.out.println();
	System.out.println("======After reverse==============");
	for(int i=arr.length-1;i>=0;i--)
	{
		System.out.println(arr[i]+" ");
	}
	}

}
