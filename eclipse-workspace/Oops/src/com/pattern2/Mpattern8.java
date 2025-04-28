package com.pattern2;

public class Mpattern8 {

	public static void main(String[] args) {
		int n=10;
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=n;j++)
			{
				if(j==0||j==10||(j==n-i && i<5)||(i==j && j<=5) )
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
				
				
			}
			System.out.println();
		}

	}

}
