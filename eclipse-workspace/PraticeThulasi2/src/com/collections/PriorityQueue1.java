package com.collections;


import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueue1 {
	public static void main(String[] args) {
		PriorityQueue<Integer>teja=new PriorityQueue<Integer>();
		teja.add(10);
		teja.add(20);
		teja.add(30);
		System.out.println(teja.peek());
		teja.poll();
		System.out.println(teja);
	
		
	}

}
