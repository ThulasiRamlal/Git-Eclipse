package com.stringPrograms;
import java.util.Scanner;

public class ReverseString2 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter Size");
		String[] arr=new String[scan.nextInt()];
		System.out.println("Enter "+ arr.length+" Strings");
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=scan.next();
	}
	System.out.println();
System.out.println("After reversing");
for(int i=arr.length-1;i>=0;i--)
{
	System.out.print(arr[i]+" ");
}

	}

}
