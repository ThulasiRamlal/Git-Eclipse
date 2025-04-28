package com.exceptionHandling;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Eh1 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter A and B values ");
		try {
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=a/b;
		System.out.println("result: "+c);
		
		System.out.println("Please enter array lenght");
		int d[]=new int[scan.nextInt()];
		}
		catch(ArithmeticException | InputMismatchException  | ArrayIndexOutOfBoundsException |NegativeArraySizeException e)
		{
			e.printStackTrace();
			
		}
		catch(Exception e)
		{
		e.printStackTrace();
		}
	}

}
