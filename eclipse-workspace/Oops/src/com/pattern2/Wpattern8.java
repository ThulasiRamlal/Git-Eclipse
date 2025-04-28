package com.pattern2;

public class Wpattern8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		for(int i=0;i<=n;i++)
		{
			for(int j=0;i<=n;j++)
			{
				if(j==0||j==10||(i+j==10 && i>=5))
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
