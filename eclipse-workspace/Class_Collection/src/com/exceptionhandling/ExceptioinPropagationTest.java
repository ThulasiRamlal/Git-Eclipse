package com.exceptionhandling;
import java.util.Scanner;

public class ExceptioinPropagationTest {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		Demo1 demo1=new Demo1();
		try {
		demo1.call1(a, b);
		}
		catch(ArithmeticException e)
		{
			System.out.println("may be You enterd wrong values So....Please enter input>0  value ");
		}
		catch(Exception e)
		{
			System.out.println("You enterd a wrong input");
		}
	}

}
