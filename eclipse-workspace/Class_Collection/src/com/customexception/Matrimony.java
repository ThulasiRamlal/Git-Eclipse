package com.customexception;

public class Matrimony {
	public void matrimony() throws Exception
	{
		UserRegistration ure=new UserRegistration();
		try {
		ure.registration();
		}
		catch(Exception e)
		{
			ure.registration();
		}
		
		
	}

}
