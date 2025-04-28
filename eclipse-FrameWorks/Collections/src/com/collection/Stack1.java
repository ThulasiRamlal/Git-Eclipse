package com.collection;

import java.util.Arrays;
import java.util.Stack;

public class Stack1 {
	public static void main(String[] args) {
		
		
		//1.Stack is a subclass of Vector class
		//2.it follows a FILO and LIFO mechanisim means Last in first Out and First In last out
		
		
		Stack<String> a= new Stack<String>();
		a.push("thulasi");
		a.push("kaveri");
		a.push("teja");
		a.push("suguna");
		a.push("pichaiah");
		
		
		
		System.out.println(a.peek());
		
		System.out.println();
		a.pop();
	System.out.println(a);
	}

}
