package programes;

import java.util.Scanner;

public class TemperaturePredictor7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =  new Scanner(System.in);
		System.out.println("enter temperature");
		int temperature = scan.nextInt();
		methodOne(temperature);
		
	}
	public static void methodOne(int temperature)
	{
		if(temperature<0)
		{
			System.out.println("The temperature " + temperature +" is categorized as Freezing.");
		}
		else if(temperature>=0 && temperature<=15)
		{
			System.out.println("The temperature " + temperature +" is categorized as Cold.");
		}
		else if(temperature>=16 && temperature<=25)
		{
			System.out.println("The temperature " + temperature +" is categorized as Moderate.");
		}
		else if (temperature>=26 && temperature<=35)
		{
			System.out.println("The temperature " + temperature +" is categorized as Worm.");
		}
		else if(temperature<35)
		{
			System.out.println("The temperature " + temperature +" is categorized as Hot.");
			
		}
		else
		{
			System.out.println("Invalid number");
		}
	}

}
