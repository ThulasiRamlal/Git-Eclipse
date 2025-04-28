package com.pattern2;

//import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		
		for(int i=0;i<=10;i++)
		{
			for(int j=0;j<=10;j++)
			{
				if(i==0||i==5||i==10||j==0||j==5||j==10||i==j)
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
