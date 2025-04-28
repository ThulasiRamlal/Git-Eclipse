package programes;

import java.util.Scanner;

public class NthtermOfSeries24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a n value: ");
		int n=scan.nextInt();
		methodOne(n);
		

	}
	public static void methodOne(int n)
	{
		int rem= (n*(n+1))/2;
		System.out.println("The "+n+"th term of series is: "+rem);
	}

}
