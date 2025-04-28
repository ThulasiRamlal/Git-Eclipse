package programes;

import java.util.Scanner;

public class SumOfNaturalNumbers9 {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter a Natural number");
		int n=scan.nextInt();
		methodOne(n);
	
	}
	public static void methodOne(int n)
	{
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			
			sum=sum+i;
		}
		System.out.println("The sum of the first "+n+" natural number is " + sum);
	}

}
