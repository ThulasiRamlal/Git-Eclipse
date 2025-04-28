package programes;

import java.util.Scanner;

public class SODUntilSD17 {

	private static final char[] sum2 = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a n value");
		int n = scan.nextInt();
		methodOne(n);

	}
	public static void methodOne(int n)
	{
		while(n>=9)
		{
			
			int sum=0;
			while(n>0)
			{
				int rem =n%10;
				sum=sum+rem;
				n=n/10;
				
			}
			int n2=sum;
			int sum2=0;
			int rem1=n2%10;
			 sum2=sum2+rem1;
			 n2=n2/10;
		}
		System.out.println(sum2);
	}

}
