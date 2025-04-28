package Oops;

public class Countdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=12345;
		int count=0;
		while(n!=0)
		{
			n=n/10;
			count++;
		}
		System.out.println(count);

	}

}
