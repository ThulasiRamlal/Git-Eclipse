package com.jdbs;

public class Jdbc25 {
	public static void main(String[] args) {
		try
		{
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("s.kdjfaks");
	}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
