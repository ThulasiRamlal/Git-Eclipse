package Oops;

import java.util.Scanner;

public class Season {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int month=scan.nextInt();
		switch(month)
		{
		case 1:
		case 12:
		case 2:System.out.println("The month number "+ month +" corresponds Winter");
		break;
		case 3:
		case 4:
		case 5:System.out.println("The month number "+ month +" corresponds Spring");
		break;
		case 6:
		case 7:
		case 8:System.out.println("The month number "+ month +" corresponds Summer");
		break;
		case 9:
		case 10:
		case 11:System.out.println("The month number "+ month +" corresponds Fall");
		break;
		default:System.out.println("The month number"+ month +"corresponds to invalid month");
				
		}

	}

}
