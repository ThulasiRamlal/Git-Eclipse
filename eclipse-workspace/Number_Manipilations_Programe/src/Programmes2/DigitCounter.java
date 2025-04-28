package Programmes2;

import java.util.Scanner;

public class DigitCounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Na value: ");
		int n=scan.nextInt();
		digitCounter(n);

	}
	public static void digitCounter(int n)
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
