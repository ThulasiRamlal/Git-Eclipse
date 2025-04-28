package programes;

import java.util.Scanner;

public class GreatestNumbers27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter num1 value: ");
		int num1 = scan.nextInt();
		System.out.println("ENter num2 value: ");
		int num2 = scan.nextInt();
		System.out.println("Enter num3 value: ");
		int num3 = scan.nextInt();
		GreatestNumbers27.methodOne(num1,num2,num3);

	}
	public static void methodOne(int num1,int num2,int num3)
	{
		if(num1>num2)
		{
			System.out.println(num1+" num1 is bigger");
		}
		else if(num2>num3)
		{
			System.out.println(num2+" num2 is bigger");
		}
		else if(num3>num1)
		{
			System.out.println(num3+" num3 is bigger");	
		}
		}

}
