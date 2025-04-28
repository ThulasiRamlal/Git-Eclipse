package Oops;

import java.util.Scanner;

public class fibonacciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int num1=0;
		int num2=1;
		int res;
		//System.out.println();
		
		
		for(int i=1;i<=n;i++)
		{
			res=num1+num2;
			num1=num2;
			num2=res;
			
			System.out.print(res+" ");
			
		}
		
		

	}
	

}
