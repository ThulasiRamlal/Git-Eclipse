package com.programmes;
import java.util.Scanner;
public class MultiplicationTable {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
	
		System.out.println("Multiplication: ");
		int n=scan.nextInt();
		MultiplicationTable.display(n);
		
	}
	public static void display(int n)
	{
		int num;
		for(int i=1;i<=10;i++)
		{
			num=n*i;
			System.out.println(n+" X "+i+" = "+num);
		}
		
	}

}
