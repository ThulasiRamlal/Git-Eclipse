package programes;

import java.util.Scanner;

public class SwappingVariable29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("a = 5 b = 4");
		System.out.println("enter A value: ");
		int a=scan.nextInt();
		System.out.println("enter B value: ");
		int b= scan.nextInt();
		methodOne(a,b);
	}
	public static void methodOne(int a,int b)
	{
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a);
		System.out.println(b);
		
	}

}
