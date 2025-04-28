package Programmes2;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter N value: ");
		int n= scan.nextInt();
		armstrongNumber(n);

	}
	public static void armstrongNumber(int n)
	{
		int res=0;
		int i=n;
		while(n>0)
		{
			int rem=n%10;
			 res=(rem*rem*rem)+res;
			 n=n/10;
		}
		if(res==i)
		{
			System.out.println("ArmStrong number: "+res);
		}
		else
		{
			System.out.println("Not Armstrong Number : "+res);
		}
	}

}
