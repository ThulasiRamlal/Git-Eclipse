package com.exceptionhandling;
import java.util.Scanner;

public class Eh2 {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		try{
			System.out.println("Connection established");
		System.out.println("Enter a and b numbers for division");
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=a/b;
		System.out.println("Division result: "+c);
		System.out.println("Enter array size");
		int arr[]=new int[scan.nextInt()];
		System.out.println("enter postion and elemnts to insert into the array");
		int position=scan.nextInt();
		int element=scan.nextInt();
		arr[position]=element;
		System.out.println("Elements are inserted at posotion "+position+" is "+arr[position]);
	}
		//Specilaized exception
		catch(ArithmeticException e)
		{
			System.out.println("Arthimeic Exception occure at line 12 reson being /by zero");
		}
		catch(NegativeArraySizeException e)
		{
			System.out.println("NegativeArraySize Exception occure at line 15 reson +ve value");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Arrayindexout of bound exceptioin occured by at the line 19 give the size");
		}
		//Genric exception
		catch(Exception e)
		{
			System.out.println("some erroe occur dont all the resources are safe and secure----Plz try again");
		}
		
		System.out.println("Connection terminated");


}
}
