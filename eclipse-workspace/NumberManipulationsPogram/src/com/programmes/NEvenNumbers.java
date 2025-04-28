package com.programmes;
import java.util.Scanner;
public class NEvenNumbers {
	public static void main(String[] args) {
		NEvenNumbers teja= new NEvenNumbers();
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter a num");
		int n=scan.nextInt();
		System.out.println("even numbers");
		NEvenNumbers.display(n);
	}
	public static void display(int n)
	{
		for(int i=0;i<=n;i++)
		{
		 if(i%2==0)
		 {
			 System.out.println(i);
		 }
		}
	}

}
