package com.collection4;
import java.util.Stack;
public class Stack2 {
	public static void main (String[] args)
	{

	Stack<String>teja=new Stack<String>();
	teja.add("Thulasi");
	teja.add("ramlal");
	teja.add("kaveri");
	teja.add("teja");
	System.out.println(teja);
	System.out.println("=================");
	System.out.println(teja.peek());
	System.out.println("===============================");
	teja.pop();
	System.out.println(teja);
	}

}
