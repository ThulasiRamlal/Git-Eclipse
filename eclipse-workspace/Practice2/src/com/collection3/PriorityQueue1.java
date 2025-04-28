package com.collection3;

import java.util.PriorityQueue;

public class PriorityQueue1 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		PriorityQueue <String> teja = new PriorityQueue<String>();
		teja.add("6");
		teja.add("4");
		teja.add("3");
		teja.add("1");
		teja.add("2");
		teja.offer("1");
		System.out.println(teja);
		System.out.println("--------------------");
		//peek()-->> it returns in TopMost value 
		//because it follows FIFO mechanism
		System.out.println(teja.peek());
		System.out.println("----------------------");
		//Poll()
		teja.poll();
		System.out.println(teja);
		//Null value -->> it gives NullPointException error
		teja.offer(null);
		System.out.println(teja);

	}

}
