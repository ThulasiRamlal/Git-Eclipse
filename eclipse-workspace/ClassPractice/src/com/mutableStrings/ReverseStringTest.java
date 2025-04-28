package com.mutableStrings;

import java.util.Scanner;

public class ReverseStringTest {
	public static void main(String[] args) {
		ReverseStringTest2 teja=new ReverseStringTest2();
		Scanner scan=new Scanner(System.in);
		System.out.println("enter STRING");
		String s1=scan.next();
		System.out.println("Converting STRING to CHAR");
       char [] arr=s1.toCharArray();
       char[] arr2=new char[arr.length];
       teja.display(arr2);
       System.out.println();
       System.out.println("============================");
       String s2=s1;
      
         
    
       
       
	}

}
