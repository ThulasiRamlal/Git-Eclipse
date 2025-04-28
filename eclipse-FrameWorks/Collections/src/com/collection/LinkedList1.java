package com.collection;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedList1 {
	public static void main(String[] args) {
		/*
		 * 1.LinkedList is Class Which implements List and Deque Interface
		 * 2.Linkedlist uses Doubly linked for storing elements
		 * 3.It can allow duplicate values
		 * 4.it can follow insertion order
		 * 5.it can allow multiple null values
		 * 6.it is mainly used for manipulation such as insertion, deletion ,sorting etc..
		 * 7.linkedlist default capacity 0 and initial capacity 0
		 *   
		*/
		
		LinkedList<String> a=new LinkedList<String>();
		a.add("thulasi");
		a.add("kaveri");
		a.add("teja");
		LinkedList<String> b=new LinkedList<String>();
		b.add("suguna");
		b.add("pichaih");
		
		a.addAll(b);
		System.out.print(a);
		System.out.println("=====================");
		a.add(0,"Nagamma");
		System.out.print(a);
	
		
		
		
		
	}

}
