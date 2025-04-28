package com.customexceptionHandling;

public class Bank {
	public void instiateAtm()
	{
		Atm atm=new Atm();
		try {
			atm.withdraw();
		}
		catch(Exception e)
		{
		  System.out.println("You enterd Wrong UserID && Password");
		}
	}

}
