package com.customexceptionHandling;

public class Matrimony {
	public void insitiateregistration()
	{
		Registration r=new Registration();
		try {
			r.registration();
		}
      catch(Exception e)
		{
    	  System.out.println("You Are not eligible for Married");
		}
	}

}
