package com.multiThreading;

import java.util.Scanner;

public class SumOfNaturalNumbers {
	public static void main(String[] args) {
		
	
	Scanner scan=new Scanner(System.in);
	
	System.out.println("Enter the Size");
int n=scan.nextInt(); 
int sum=0;

for(int i=1;i<=n;i++)
{
	
sum=sum+i;
}
System.out.println("Sum Of Natural Number: "+sum);

}
}
