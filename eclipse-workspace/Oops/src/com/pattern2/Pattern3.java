package com.pattern2;
public class Pattern3
{
	public static void main(String[] args) {
		int n=10;
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=n;j++)
			{
				if(i==0||i==5||i==10||j==5)
				{
				System.out.print("*");
				}
			else
			{
				System.out.print(" ");
			}
				
		}
			System.out.println();
	}
	
}
}
