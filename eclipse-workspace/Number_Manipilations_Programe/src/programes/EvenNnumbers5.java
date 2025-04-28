package programes;

import java.util.Scanner;

public class EvenNnumbers5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		System.out.println("enter a N value");
		int n=scan.nextInt();
		evenN(n);
	}
	public static void evenN(int n)
	{
		for(int i=1;i<=n*2;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
	}
	

}
