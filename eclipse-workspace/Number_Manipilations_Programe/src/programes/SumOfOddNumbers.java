package programes;

import java.util.Scanner;

public class SumOfOddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a N value");
		int n= scan.nextInt();
		methodOne(n);
		

	}
	public static void methodOne(int n)
	{
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			if(i%2==1)
			{
				sum=sum+i;
				
			}
		}
		System.out.println("The sum of all odd numbers between 1 and "+n+" is "+sum);
	}

}
