package programes;

import java.util.Scanner;

public class Square34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter  N value: ");
		int n =scan.nextInt();
		methodOne(n);

	}
	public static void methodOne(int n)
	{
		for(int i=1;i<=n;i++)
		{
			int cube = (i*i);
			System.out.println("The square of "+i+" is: "+cube );
		}
	}

}
