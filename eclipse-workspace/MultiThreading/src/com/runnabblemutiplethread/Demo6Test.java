package com.runnabblemutiplethread;

public class Demo6Test {
public static void main(String[] args) {
	Demo6 d=new Demo6();
	Thread t1=new Thread(d);
	Thread t2=new Thread(d);
	Thread t3=new Thread(d);
	
	t1.setName("Boy");
	t2.setName("Girl");
	t3.setName("other");
	
	t1.start();
	t2.start();
	t3.start();
	
}

}
