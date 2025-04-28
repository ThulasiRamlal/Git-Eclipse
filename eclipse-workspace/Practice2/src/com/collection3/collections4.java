package com.collection3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class collections4  {
	public static void main(String[] args) {
		Queue<Integer> teja= new PriorityQueue<Integer>();
		teja.add(10);
		teja.add(20);
		teja.add(30);
		teja.add(30);
		teja.add(20);
		teja.add(10);
		teja.offer(40);
		//System.out.println(teja);
		teja.poll();
		System.out.println(teja);
		System.out.println(teja.peek());
		
		}
	}


