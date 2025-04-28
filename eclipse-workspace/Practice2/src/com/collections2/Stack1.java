package com.collections2;
import java.util.*;

public class Stack1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> teja =new Stack<Integer>();
		teja.push(10);
		teja.push(20);
		teja.push(40);
		
		teja.push(30);
		teja.add(50);
		/*
		 * teja.push(30); teja.push(20); teja.push(10);
		 */
		//pop() method
		teja.pop();
		System.out.println(teja);
		//System.out.println(teja.peek());

	}

}
