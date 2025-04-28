package programes;

import java.util.Scanner;

public class ReverseNumber13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a n value");
		int n = scan.nextInt();
		ReverseNumber13.methodOne(n);

	}
	public static void methodOne(int n)
	{
		int rev=0;
		while(n>0)
		{
		int rem=n%10;
		rev=rev*10+rem;
		n=n/10;
		}
	System.out.println( "reverse number: "+rev);
}
}
