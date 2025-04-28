package com.patterns;

public class Pattern3 {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=n-i+1;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		
		}
			

	}
	

