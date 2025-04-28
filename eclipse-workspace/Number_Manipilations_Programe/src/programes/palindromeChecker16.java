package programes;

import java.util.Scanner;

public class palindromeChecker16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		System.out.println("enter a n value:");
        int n = scan.nextInt();
        methodOne(n);
        
	}
	public static void methodOne(int n)
	{
		int rev=0;
		//int rem;
		int i=n;
		while(n>0)
		{
		int rem=n%10;
		rev=rev*10+rem;
		n=n/10;
		}
	
	if(i==rev)
	{
		System.out.println(rev+" yes ");
	}
	else
	{
		System.out.println(rev+" No ");
	}
	}
}
