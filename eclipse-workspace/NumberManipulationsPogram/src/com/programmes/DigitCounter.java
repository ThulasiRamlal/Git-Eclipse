package com.programmes;
import java.util.Scanner;
public class DigitCounter {
	public static void main(String[] args) {
		DigitCounter teja= new DigitCounter();
		Scanner scan= new Scanner(System.in);
		System.out.println("enter a digit");
		int n=scan.nextInt();
		teja.display(n);
	}
	public void display(int n)
	{
		int count=0;
		while(n!=0)
		{
		n=n/10;
		count++;
		}
		System.out.println(count);
	}

}
