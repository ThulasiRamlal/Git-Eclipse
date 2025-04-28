package com.practice;

public class Daemon1 implements Runnable {

	@Override
	public void run() {
		Thread t=Thread.currentThread();
		String name=t.getName();
	if(name.equals("Thread1"))
	{
		userThread();
	}
	else
	{
		daemonThread();
	}	
	}
	
	 public void userThread()
	{
		try
		{
		for(int i=0;i<10;i++)
		{
		Thread.sleep(1000);
			System.out.println("User thread 1: "+i);
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	 public void daemonThread()
	{
		try
		{
			
		for(int i=0;i<10;i++)
		{
			Thread.sleep(2000);
			System.out.println("DaemonThread "+i);
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	}

