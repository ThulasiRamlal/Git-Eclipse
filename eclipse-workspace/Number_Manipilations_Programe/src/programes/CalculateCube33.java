package programes;

import java.util.Scanner;

public class CalculateCube33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a N value: ");
		int n = scan.nextInt();
		methodOne(n);
		

	}
	public static void methodOne(int n)
	{
		int cube ;
		for(int i =1;i<=n;i++)
		{
			cube = (i*i*i);
			System.out.println("The cube of "+i+" is :"+cube);
			
		}
		
	}
	

}
