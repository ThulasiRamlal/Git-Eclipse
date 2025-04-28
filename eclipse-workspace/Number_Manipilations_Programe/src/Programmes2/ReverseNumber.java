package Programmes2;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter N value: ");
		int n=scan.nextInt();
		reverseNumber(n);
		

	}
	public static void reverseNumber(int n)
	{
		int res = 0;
		while(n>0)
		{
			int rem=n%10;
			 res=res*10+rem;
			 n=n/10;
		}
		System.out.println(res);
	}
	

}
