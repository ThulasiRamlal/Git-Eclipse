package programes;

import java.util.Scanner;

public class DigitCounter11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a N value");
		long n=scan.nextLong();
		methodOne(n);
		
	}
	public static void methodOne(long n)
	{
		long count=0;
		long res=0;
		while(n!=0)
		{
			n=n/10;
			count++;
			
		}

		System.out.println(count);

	
		
	}

}
