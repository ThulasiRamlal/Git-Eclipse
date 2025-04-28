package com.programmes;

import java.util.Scanner;

public class FibonacciSeries {
public static void main(String[] args) {
	FibonacciSeries teja=new FibonacciSeries();
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter value");
	int n=scan.nextInt();
	teja.display(n);
	
	
}
public void display(int n)
{
	int n1=0;
	int res;
	int n2=1;
for(int i=3;i<=n;i++)
	{
		 res=n1+n2;
		n1=n2;
		n2=res;
		System.out.print(res+" ");
	}

	
}
}
