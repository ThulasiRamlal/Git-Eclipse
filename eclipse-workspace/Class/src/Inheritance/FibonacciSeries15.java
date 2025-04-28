package Inheritance;

import java.util.Scanner;

public class FibonacciSeries15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =  new Scanner(System.in);
		  System.out.println("Enter a N value"); 
		  int n=scan.nextInt();
		  methodOne(n);
		

	}
	public static void methodOne(int n)
	{
		
		int num1 = 0;
		int num2 = 1;
		int res=0;
		for(int i=1;i<n;i++)
		{
			System.out.print(num1+", ");
			 res=num1+num2;
		num1=num2;
		
		num2=res;
		//sum=res+sum;
		}
		
		System.out.println(res);
	}

}
