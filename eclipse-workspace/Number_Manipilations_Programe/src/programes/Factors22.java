package programes;

import java.util.Scanner;

public class Factors22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number=scan.nextInt();
		System.out.println("Factors of "+number+" are: ");
		Factors22 teja =new Factors22();
		teja.factorMethod(number);

	}
	public void factorMethod(int number)
	{
		for(int i=1;i<=number;i++)
		{
			if(number%i==0)
			{
				System.out.println(i);
			}
		}
	}

}
