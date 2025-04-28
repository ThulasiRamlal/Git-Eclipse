package com.string;
import java.util.Scanner;

public class Duplicate {
	public static void main(String[] args) 
	{
		
		Scanner scan=new Scanner (System.in);
		System.out.println("Enter UserINput");
		String str=scan.next();
		System.out.println("after Duplicate String");
		System.out.println();
		char[]ch=str.toCharArray();
		System.out.println(ch);
		StringBuilder s=new StringBuilder();
			
		for(int i=0;i<ch.length;i++)
		{
			boolean repate=false;
			
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					repate=true;
					break;
				}
			}
		if(!repate)
		{
			s.append(ch[i]);
		}
		}
		System.out.println(s);
}
}