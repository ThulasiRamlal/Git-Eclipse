package programes;

import java.util.Scanner;

public class SumOfDigits30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a N value: ");
		int n=scan.nextInt();
		methodOne(n);

	}
	public static void methodOne(int n)
	{
		int sum=0;
		while(n!=0)
		{
			int rem =n%10;
			sum=sum+rem;
			n=n/10;
		}
		System.out.println("sum of digits: "+sum);
	}

}
