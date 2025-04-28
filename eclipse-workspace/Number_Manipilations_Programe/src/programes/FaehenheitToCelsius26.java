package programes;

import java.util.Scanner;

public class FaehenheitToCelsius26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a farhenheit: ");
		double farhenhiet=scan.nextDouble();
		methodOne(farhenhiet);
		
	}
	public static void methodOne(double farhenhiet)
	{
		
		double celsius=((farhenhiet-32)*5)/9;
		System.out.println(celsius);
}

}
