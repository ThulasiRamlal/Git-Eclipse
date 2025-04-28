package com.collections2;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueue1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer>teja =new PriorityQueue<Integer>();
		teja.add(10);
		teja.add(11);
		teja.add(12);
		teja.add(13);
		teja.add(14);
		teja.add(15);
		teja.add(10);
		teja.add(11);
		teja.add(12);
		teja.add(13);
		teja.add(14);
		teja.add(15);
		//teja.add(null);
		teja.poll();
	    System.out.println(teja.poll());
		//System.out.println("====================");
		//System.out.println(teja.peek());
		System.out.println(teja);
	
		
		//teja.add(null);
		//System.out.println(teja);
		//System.out.println(teja.peek());
		//System.out.println(teja.offer("ramlal"));
		//System.out.println(teja.remove());
		//System.out.println(teja);
		//teja.poll();//it useto remove first in first out eleme
		//nt
		//System.out.println(teja.peek());
		//System.out.println(teja.peek());
		//System.out.println(teja);
		//System.out.println(teja.poll());
		//System.out.println(teja);

	}

}
