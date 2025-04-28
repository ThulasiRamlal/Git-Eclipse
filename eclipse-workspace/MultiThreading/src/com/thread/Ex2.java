package com.thread;

public class Ex2 {
	public static void main(String[] args) {
		try {
		System.out.println("HEllo world");
		for(int i=0;i<=9;i++)
		{
			System.out.println("Kodnest");
			Thread.sleep(5000);
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
