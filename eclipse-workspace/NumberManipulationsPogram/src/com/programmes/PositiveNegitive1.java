package com.programmes;
import java.util.Scanner;

public class PositiveNegitive1 {
	public static void main(String[] args) {
		PositiveNegitive1 teja=new PositiveNegitive1();
		Scanner scan= new Scanner(System.in);
		System.out.println("enter a number");
		int num=scan.nextInt();
		teja.display(num);
	
	}
	public void display(int num)
	{
		if(num>0)
		{
			System.out.println(num+" :is positive number");
		}
		else if(num<0)
		{
			System.out.println(num+" :is negitve number");
		}
		else
		{
			System.out.println(num+" is zero");
		}
		
	}

}
