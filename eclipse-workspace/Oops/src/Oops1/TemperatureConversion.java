package Oops1;

import java.util.Scanner;

public class TemperatureConversion {
	public static void main(String[] args)
	{
		 Scanner scanner = new Scanner(System.in);

	        System.out.println("Temperature Converter");
	        System.out.println("1. Celsius to Fahrenheit");
	        System.out.println("2. Fahrenheit to Celsius");
	        System.out.print("Choose an option (1 or 2): ");
	        int option = scanner.nextInt();

	        if (option == 1) {
	            System.out.print("Enter temperature in Celsius: ");
	            double celsius = scanner.nextDouble();
	            double fahrenheit = (celsius * 9/5) + 32;
	            System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit");
	        } else if (option == 2) {
	            System.out.print("Enter temperature in Fahrenheit: ");
	            double fahrenheit = scanner.nextDouble();
	            double celsius = (fahrenheit - 32) * 5/9;
	            System.out.println(fahrenheit + " Fahrenheit is " + celsius + " Celsius");
	        } else {
	            System.out.println("Invalid option. Please choose either 1 or 2.");
	        }

	        scanner.close();
	}
}
