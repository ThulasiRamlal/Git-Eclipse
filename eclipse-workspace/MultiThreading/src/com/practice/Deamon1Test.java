package com.practice;

public class Deamon1Test {
	public static void main(String[] args) {
		Daemon1 d=new Daemon1();
	Thread t=new Thread(d);
	Thread t2=new Thread(d);
	t.setName("Thread1");
	t2.setName("DeamonThread");
	t.start();
	t2.setDaemon(true);
	t2.start();
	System.out.println(t2.isDaemon());
				
	}

}
