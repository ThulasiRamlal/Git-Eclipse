package com.controlConstructs;

public class JumpingControlConstructs {

	public static void main(String[] args) {
		//break1();
		continue1();
	}
	
	public static void break1()
	{
		 for (int i = 1; i <= 10; i++)
		 {
	            if (i == 5) {
	                System.out.println("break i = " + i);
	                break;  // Skips the current iteration when i is 5
	            }
	            System.out.println("i = " + i);
	        }
	
	}
	
	public static void continue1()
	{
		for(int i=1;i<10;i++)
		{
			if(i==5)
			{
				System.out.println("Skip the current Execution");
				continue;
			}
			System.out.println(i);
		}
	}
}
