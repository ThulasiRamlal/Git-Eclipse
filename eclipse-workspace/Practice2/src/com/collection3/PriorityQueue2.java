package com.collection3;

import java.util.PriorityQueue;

public class PriorityQueue2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<String>teja =new PriorityQueue<String>();
		teja.add("thulasi");
		teja.add("kaveri");
		teja.add("teja");
		System.out.println(teja);
		System.out.println(teja.peek());
		teja.poll();
		System.out.println(teja);

	}

}
