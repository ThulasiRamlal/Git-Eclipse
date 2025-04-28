package programes;

import java.util.Scanner;

public class PrimeNumber22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a N value");
		int n= scan.nextInt();
		methodOne(n);
		
		
	}
		public static void methodOne(int n)
		{
			int count=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		
		if(count==2)
		{
			System.out.println(n+" : is prime number");
		}
		else
		{
			System.out.println(n+" : is not prime number ");
		}
		
}
}
