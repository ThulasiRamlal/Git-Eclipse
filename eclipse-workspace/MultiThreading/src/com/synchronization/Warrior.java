package com.synchronization;

public class Warrior implements Runnable {
	String astra1="sarpastra";
	String astra2="Brahmahstra";
	String astra3="pasupatastra";

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try
		{
			Thread.sleep(5000);
			synchronized(astra1)
			{
				System.out.println(Thread.currentThread().getName()+" Has Acquired Astra1 "+astra1);
				Thread.sleep(5000);
				synchronized(astra2)
				{
				System.out.println(Thread.currentThread().getName()+" Has Acqured Astra2 "+astra2);	
				
				Thread.sleep(5000);
				synchronized(astra3)
				{
					System.out.println(Thread.currentThread().getName()+" Has Acquired Astra3 "+astra3);
				
				Thread.sleep(5000);
			}
			
		}
		
	}
	

}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
