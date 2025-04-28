package com.collection3;

import java.util.Stack;

public class Stack1 {
	public static void main(String[] args) {
		Stack<String> teja =new Stack<String>();
		teja.add("thulasi");
		teja.push("Kaveri");
		teja.push("teja");
		teja.add("Suguna");
		System.out.println(teja);
		System.out.println("----------------------");
		//peek() method--->>> it returns top most value
		System.out.println(teja.peek());
		System.out.println("-----------------------");
		//pop()----->>> it will removes the top most value
		teja.pop();
		System.out.println(teja);
		System.out.println("-----------");
		//
		
		System.out.println(teja.elementAt(0));
		
	}

}
