package com.mutableStrings;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter  String");
		String s1=scan.next();
char[] arr=s1.toCharArray();
System.out.println("Converting STRING to CHAR");
for(char i:arr)
{
	System.out.print(i+" ");
}
System.out.println();
System.out.println("Reversing the CHAR");
for(int i=arr.length-1;i>=0;i--)
{
	System.out.print(arr[i]+" ");
	
}
System.out.println();
System.out.println("=================================");

String s2=new String(arr);
System.out.println(s2);








	}
}
