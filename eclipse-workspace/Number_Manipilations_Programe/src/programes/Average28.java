package programes;

import java.util.Scanner;

public class Average28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter num1 value: ");
		double num1 = scan.nextDouble();
		System.out.println("Enter  num2 value: ");
        double num2 = scan.nextDouble();
        methodOne(num1,num2);
	}
	public static void methodOne(double num1,double num2)
	{
		//average formula
		double average = (num1+num2)/2;
		System.out.println("Average of two values is: "+average);
	}

}
