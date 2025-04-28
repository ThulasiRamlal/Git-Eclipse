package programes;

import java.util.Scanner;

public class SeniorCitizenDiscount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a age");
		int age = scan.nextInt();
		methodOne(age);
	}
	public static void methodOne(int age)
	{
		if(age>=60)
		{
			System.out.println("You are eligible for Senior citizen");
		}
		else
		{
			System.out.println("You are not eligible for Senior citizen");
		}
	}

}
