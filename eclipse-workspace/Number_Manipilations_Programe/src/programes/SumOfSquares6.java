package programes;

import java.util.Scanner;

public class SumOfSquares6 {
	//The sum of square The first  n natural numbers  sum

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a N value");
		int n= scan.nextInt();
		methodOne(n);

	}
	public static void methodOne(int n)
	{
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			int square = i*i;
			sum = sum +square;
			//System.out.println(sum);
		}
		System.out.println("The sum of square The first "+ n +" natural numbers: " + sum);
	}

}
