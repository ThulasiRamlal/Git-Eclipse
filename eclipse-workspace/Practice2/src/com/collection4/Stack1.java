package com.collection4;

import java.util.List;
import java.util.Arrays;
import java.util.Stack;
public class Stack1 {
	public static void main(String[] args) {
		Stack<Integer>teja= new Stack<Integer>();
		teja.add(10);
		teja.add(20);
		teja.add(30);
		teja.add(490);
		teja.add(500);
		//System.out.println(teja);
		System.out.println(teja.peek());
		System.out.println("==========================");
		teja.pop();
		System.out.println(teja);
		
	}

}
