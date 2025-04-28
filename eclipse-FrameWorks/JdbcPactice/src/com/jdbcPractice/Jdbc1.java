
package com.jdbcPractice;

public class Jdbc1 {
	
	public static void main(String[] args) {
		try
		{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Succefull...");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	

}
