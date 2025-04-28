package programes;

import java.util.Scanner;

public class PrimeRange23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter a start value: ");
		int start = scan.nextInt();
		System.out.println("Enter a end value: ");
		int end = scan.nextInt();
		methodOne(start,end);
		

	}
	public static void methodOne(int start,int end)
	{
		int count=0;
		for(int i=start;i<=end;i++)
		{
			for(int j=2;j<=i;j++)
			{
				if(i%j==0)
						
				{
					count++;
				}
			}
			if(count==2) 
			{
			System.out.println("prime numbers between "+i);
		}
			
		}
		
	
	}

}
