package com.synchronization;

public class WarriorTest {
	public static void main(String[] args) {
		Warrior d=new Warrior();
		Thread t1=new Thread(d);
		Thread t2=new Thread(d);
		
		t1.setName("Karna");
		t2.setName("Arjuna");
		
		t1.start();
		
		t2.start();
	}

}
