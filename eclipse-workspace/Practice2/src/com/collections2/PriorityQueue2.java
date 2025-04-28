package com.collections2;

import java.util.PriorityQueue;

public class PriorityQueue2 {
	public static void main(String[]args)
	{
		PriorityQueue<String> teja  =new PriorityQueue<String>();
		teja.offer("thulasi");
		teja.add("kaveri");
		teja.add("teja");
		//System.out.println(teja);
        //System.out.println(teja.peek());
       // teja.poll();
        //System.out.println(teja);
		/*
		 * System.out.println(teja.remove("kaveri")); System.out.println(teja);
		 */
		
	teja.add("arthi");
	teja.add("aaa");
	teja.add("abb");
	teja.add("baa");
	System.out.println(teja);
	
	
	}

}
