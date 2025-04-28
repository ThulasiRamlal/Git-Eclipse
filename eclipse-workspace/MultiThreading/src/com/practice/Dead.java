package com.practice;

public class Dead  implements Runnable{
	String s1="Bhanu";
	String s2="thulasi";

	@Override
	public void run() {
		Thread t=Thread.currentThread();
		String name=t.getName();
		if(name.equals("s1"))
		{
			s1();
		}
		else
		{
			s2();
		}
		
		
	}
	public void s1()
	{
		while(true)
		{
			try
			{
			synchronized(s1)
			{
				System.out.println("Thread1 locked:"+s1);
				Thread.sleep(2000);
				
			
			synchronized(s2)
			{
				System.out.println("Thread2 locked: "+s2);
			}
			}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}	
	}
	
	public void s2()
	{
		while(true)
		{
			try
			{
			synchronized(s2)
			{
				System.out.println("Thread2 locked:"+s2);
				
				
			
			synchronized(s2)
			{
				System.out.println("Thread1 locked: "+s1);
			}
			}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
	

}
