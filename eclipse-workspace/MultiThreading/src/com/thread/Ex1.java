package com.thread;

public class Ex1 {
	public static void main(String[] args) {
		System.out.println("Hello world");
		 Thread t=Thread.currentThread();
		 System.out.println(t);
		 t.setName("THULASI");
		 System.out.println(t);
		 t.setPriority(4);
		 System.out.println(t);
		t.setPriority(Thread.MIN_PRIORITY);
		System.out.println(t);
		t.setPriority(Thread.MAX_PRIORITY);
		System.out.println(t);
		t.setPriority(Thread.NORM_PRIORITY);
		System.out.println(t);
	}

}
