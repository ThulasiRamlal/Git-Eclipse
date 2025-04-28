package com.programmes;
import java.util.Scanner;
public class Palindrome {
public static void main(String[] args) {
	Palindrome teja= new Palindrome();
	Scanner scan= new Scanner(System.in);
	System.out.println("enter number");
	int n=scan.nextInt();
	teja.display(n);
	
}
public void display(int n)
{
int rev = 0;
int n1=n;
	while(n!=0)
	{
		int rem=n%10;
		 rev=rev*10+rem;
		 n=n/10;
	}
	if(rev==n1)
	{
		System.out.println("palindrome");
	}
	else
	{
		System.out.println("not palindrome");
	}
	
}
}
