package programes;

import java.util.Scanner;

public class ArmStrongNumber12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a n value");
		int n= scan.nextInt();
		// TODO Auto-generated method stub
		methodOne(n);

	}
	public static void methodOne(int n)
	{
	
	int i=n;
		int arm=0;
		int rem;
		while(n>0) 
		{
		rem=n%10;
		arm=arm+(rem*rem*rem);
		n=n/10;
		}
	if(arm==i)
	{
	System.out.println(arm+" it is Armstrong number");
	}
	else
	{
		System.out.println(arm+" is not Armstrong number");
	}
		
	}
}
