
package com.producerConsumer;

public class Factory {
	int x;

	public void getX()
	{
		System.out.println("Consumer Has Consumed "+x+" From Factory" );
	}

	public void setX(int x) 
	{
	System.out.println("Producer Has Produced "+x+" in Factory");
	}
}
