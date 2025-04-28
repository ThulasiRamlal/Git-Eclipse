package com.synchronization;

public class Warrior1test {
	public static void main(String[] args) {
		
	
	Wariror1 w=new Wariror1();
	Thread t=new Thread(w);
	Thread t1=new Thread(w);

	t.setName("karna");
	t1.setName("arjuna");
	
	t.start();
	t1.start();
	}
}
