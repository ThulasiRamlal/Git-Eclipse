package Inheritance;

import java.util.Scanner;

public class TempratureConversion1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int temp=scan.nextInt();
		fahrenheit(temp);
		celsius(temp);
	}
	static double res;
	public static void fahrenheit(int temp)
	{
		res=(temp*9/5)+32;
		System.out.println(res);
	}
	public static void celsius(int temp)
	{
		res=((temp-32)*5)/9;
		System.out.println(res);
	}
}
