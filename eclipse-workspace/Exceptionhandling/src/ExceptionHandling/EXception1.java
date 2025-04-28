package ExceptionHandling;

import java.rmi.AccessException;

public class EXception1 {
	public static void main(String[] args) throws ArithmeticException {
		int fNum=20;
		int sNum=0;
		int res=0;
		try {
		 res=fNum/sNum;
		}
		
		catch(ArithmeticException Ae)
		{
			int a=10;
			int b=20;
			int c=a+b;
			System.out.println("catch block: "+c);
			
		}
		finally {
			System.out.println("finally block");
		}
		
		System.out.println("res: "+res);
		
	}

}

