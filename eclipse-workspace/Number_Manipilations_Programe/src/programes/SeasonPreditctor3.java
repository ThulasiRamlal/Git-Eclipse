package programes;

import java.util.Scanner;

public class SeasonPreditctor3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a month");
		int month =scan.nextInt();
		monthNumber(month);

	}
	public static void monthNumber(int month)
	{
		switch(month)
		{
		case 1:
		case 2:
		case 12:System.out.println("Janauary , feburary , December Corresponds in Winter ");
		break;
		case 3:
		case 4:
		case 5:System.out.println("March , April , May Corresponds in Spring ");
		break;
		case 6:
		case 7:
		case 8:System.out.println("June , July , August Corresponds in Summer ");
		break;
		case 9:
		case 10:
		case 11 :System.out.println("September , october , November Corresponds in Fall ");
		default:System.out.println("The Month Number"+month+" Corresponds to invalid month number");
		}
	}

}
