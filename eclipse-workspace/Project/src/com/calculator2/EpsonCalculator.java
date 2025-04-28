package com.calculator2;

import java.util.Scanner;

public class EpsonCalculator extends ScientificCalculator {
	
	  public static void main(String[] args) { 
		  Scanner scan = new
	  Scanner(System.in);
		  int num=scan.nextInt();
		  EpsonCalculator teja = new EpsonCalculator(); 
		  teja.isPrime(num);
		  
			
			  teja.add(); 
			  teja.sub();
			  teja.mul(); 
			  teja.div();
			  teja.mod();
			 
			/*
			 * EpsonCalculator2 teja1 = new EpsonCalculator2(); teja1.accept(new
			 * EpsonCalculator());
			 */
		  }
	 

	@Override
	public void div() {
		// TODO Auto-generated method stub
		System.out.println("Division");
	}
	public void isPrime(int num)
	{
		int count=0;
		for(int i=2;i<=num;i++)
		{
			if(i%num==0)
			{
				count++;
				
			}
			
		
		}
		if(count==2)
		{
			System.out.println(num+" is a prime number");
		}
		else
		{
			System.out.println(num+" is not prime number");
		}
		
		
		}
	}


