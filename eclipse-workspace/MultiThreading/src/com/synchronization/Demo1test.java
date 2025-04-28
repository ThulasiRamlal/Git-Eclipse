package com.synchronization;

public class Demo1test {
	public static void main(String[] args) {
		try
		{
		Demo1 d=new Demo1();
		Thread t1=new Thread(d);
		Thread t2=new Thread(d);
		Thread t3=new Thread(d);
		t1.setName("Boy");
		t2.setName("Girl");
		t3.setName("Other");
		t1.start();
		t2.start();
		t3.start();
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
