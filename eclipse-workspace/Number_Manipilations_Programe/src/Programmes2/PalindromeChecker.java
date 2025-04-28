package Programmes2;

import java.util.Scanner;

public class PalindromeChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter N value: ");
		int n=scan.nextInt();
		palindrome(n);

	}
	public static void palindrome(int n)
	{
		int palindrome=n;
		int rem;
		int rev=0;
		System.out.println(n+"   -----------");
		while(n!=0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		if(rev==palindrome)
		{
			System.out.println(rev+" :palindrome");
		}
		else
		{
			System.out.println(rev+" :not palindrome");
		}
		
	}
	

}
