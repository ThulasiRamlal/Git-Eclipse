package Programmes2;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner scan=new Scanner(System.in);
     System.out.println("enter value");
     int n=scan.nextInt();
		display(n);
		}
		public static void display(int n)
		{
			int res ;
			int num1=0;
			int num2=1;
			for(int i=1
					;i<=10;i++)
			{
				 res=num1+num2;
				num1=num2;
				num2=res;
				System.out.print( res+" ");
			
		}
		
		
	
	
	
	}
}
