package Programmes2;

import java.util.Scanner;

public class PrimeNumber {
	//whether check is prime number are not prime number.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter N value: ");
		int n=scan.nextInt();
		primeNumber(n);

	}
	public static void primeNumber(int n)
	{
		int count=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
				System.out.println(i+" ,");
				
			}
		}
		
	}

}
