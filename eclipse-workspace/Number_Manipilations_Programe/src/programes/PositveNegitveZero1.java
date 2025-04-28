package programes;

import java.util.Scanner;

public class PositveNegitveZero1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a n");
		int n=scan.nextInt();
		methodOne(n);

	}
	public static void methodOne(int n)
	{
		if(n>0)
		{
			System.out.println(n + " is positive number");
		}
		else if(n<0)
		{
			System.out.println(n +" is a negitve number");
		}
		else
		{
			System.out.println(n + " is a zero");
		}
	}

}
