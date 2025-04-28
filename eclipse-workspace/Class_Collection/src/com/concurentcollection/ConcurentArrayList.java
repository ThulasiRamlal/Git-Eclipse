package com.concurentcollection;
import java.util.concurrent.*;
import java.util.ArrayList;
import java.util.Iterator;

public class ConcurentArrayList {
	public static void main(String[] args) {
		CopyOnWriteArrayList <Integer> t=new CopyOnWriteArrayList<Integer>();
		t.add(10);
		t.add(20);
		t.add(30);
		t.add(40);
	System.out.println(t);
	System.out.println("=========================");
	Iterator<Integer> itr=t.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next()+" ");
		t.add(50);
	}
	System.out.println(t);
	}

}
