package Inheritance;

import java.util.Scanner;

public class practice {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a n vslue");
		int n = scan.nextInt();
		methodOne(n);
	
		
		

}
	public static void methodOne(int n)
	{
		int arm=0;
		int rem;
		int i=n;
		while(n>0)
		{
			 rem =n%10;
			arm=arm+(rem*rem*rem);
			n=n/10;
		}
		if(arm==i)
		{
			System.out.println(arm+" is armstrong number");
		}
		else
		{
			System.out.println(arm+" is not armstrong Number");
		}
		
	}
		
}
