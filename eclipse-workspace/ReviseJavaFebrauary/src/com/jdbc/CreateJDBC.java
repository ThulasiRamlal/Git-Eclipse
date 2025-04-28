package com.jdbc;

public class CreateJDBC {
	
	public static void main(String[] args) {
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Succefully registered..");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	

}
