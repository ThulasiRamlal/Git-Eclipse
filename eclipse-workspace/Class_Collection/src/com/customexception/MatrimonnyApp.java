package com.customexception;

public class MatrimonnyApp {
	public static void main(String[] args) throws Exception
	{
		Matrimony mt=new Matrimony();
		System.out.println("Welcome To matrimony");
		System.out.println("Connection Established");
		mt.matrimony();
		System.out.println("Connection Terminated");
	}

}
