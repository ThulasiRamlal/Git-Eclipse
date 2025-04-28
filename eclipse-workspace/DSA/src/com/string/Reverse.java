package com.string;

import java.util.Scanner;
public class Reverse {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter UserInput");
		String str=scan.next();
		System.out.println("......Original String.....");
		char[] ch=str.toCharArray();
		//1st approach
		for(int i=ch.length-1;i>=0;i--)
		{
			System.out.print(ch[i]+" ");
		}
		System.out.println();
		System.out.println("=================================");
		//2nd approach
		for(int i=str.length()-1;i>=0;i--)
		{
			System.out.print(str.charAt(i)+" ");
		}
		
	}

}
