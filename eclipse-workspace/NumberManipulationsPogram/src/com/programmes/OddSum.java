package com.programmes;
import java.util.Scanner;

public class OddSum {
	public static void main(String[] args) {
		OddSum teja= new OddSum();
		Scanner scan= new Scanner(System.in);
		System.out.println("enter number");
		int num=scan.nextInt();
		display(num);
		
	}
   public static void display(int num)
   {
	   int sum=0;
	   for(int i=0;i<=num;i++)
	   {
		   if(i%2==1)
		   {
			 sum=sum+i;
			 
		   }
	   }
	   System.out.println("Sum of Odd Numbers");
	   System.out.println(sum);
   }
   

}
