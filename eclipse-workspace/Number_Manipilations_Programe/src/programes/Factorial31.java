package programes;

import java.util.Scanner;

public class Factorial31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter N value: ");
		int n=scan.nextInt();
		methodOne(n);

	}
	public static void methodOne(int n)
	{
		int fact =1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of "+n+" is: "+fact);
	}

}
