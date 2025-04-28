package com.collection4;
import java.util.PriorityQueue;
public class PriorityQueue1 {
	public static void main(String[]args)
	{
	PriorityQueue<Integer>teja=new PriorityQueue<Integer>();
	teja.add(10);
	teja.add(9);
	teja.add(8);
	teja.add(7);
	teja.add(6);
	teja.add(5);
	teja.add(4);
	//
	System.out.println(teja);
	System.out.println("==============================");
	System.out.println(teja.peek());
	System.out.println("==============================");
	teja.poll();
	System.out.println(teja);
	}

}
