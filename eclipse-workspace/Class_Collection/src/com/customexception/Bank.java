package com.customexception;

public class Bank {
	public void instiateAtm() throws Exception  
	{
		Atm atm=new Atm();
		
		{
		try {
			atm.withdraw();
		} 
		//1 st chance
		catch (InvaliUserIdOrPwdException e)
		{
			System.out.println(" 2nd chance Enter valid User ID and PWD ");
			// 2nd chance
			try
			{
				atm.withdraw();
			}
			catch(Exception e1)
			{
				System.out.println("3nd chance Enter valid User ID and PWD");
				try 
				{
					atm.withdraw();
				}
				catch(Exception e2)
				{
					System.out.println("Blocked your Account......");
				}
			}
				
			}
		}
	}
	}


