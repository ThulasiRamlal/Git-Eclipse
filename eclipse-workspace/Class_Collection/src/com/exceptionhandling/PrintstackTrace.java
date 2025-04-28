package com.exceptionhandling;
import java.lang.*;
public class PrintstackTrace {
	public static void main(String[] args) {
		printStackTrace();
	}
	
		public static void printStackTrace()
		{
			try {
			int a=10;int b=0;
			int res=a/b;
			System.out.println("Division: "+res);
			}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
