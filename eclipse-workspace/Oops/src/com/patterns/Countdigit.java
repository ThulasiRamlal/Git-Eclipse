package com.patterns;

public class Countdigit {

	public static void main(String[] args) {
		int n=121;
		int sum=0;
		sum=n;
		
		while(n!=0)
		{
			sum=sum*10+1;
			n=n/10;
			
		}
		if(n==sum)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}
	
		
		
	}
	}


