package Oops;

public class SumofSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int res=0;
		int  sum1=0;
		
		for(int i=1;i<=20;i++)
		{
			sum=i*i;
			res=res+sum;
			 //sum1=res;
			//---System.out.println(res);
			
		}
		System.out.println("The sum of square first 20 natural numbers "+res);

	}

}
