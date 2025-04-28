package com.collection;

//import java.util.*;
import java.util.Set;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.PriorityQueue;
import java.util.Map.Entry;
import java.util.Iterator;
public class Collection {
	public static void main(String[] args) {
		System.out.println("===========ARRAY LIST===============");
		ArrayList<Integer> ar=new ArrayList<Integer>();
		ar.add(10);
		ar.add(20);
		ar.add(30);
		for(int i = 0;i<ar.size();i++)
		{
			System.out.println(ar.get(i));
		}
		System.out.println("=========LINKED LIST================");
    	LinkedList<Integer>ll=new LinkedList<Integer>();
		ll.add(40);
		ll.add(50);
		ll.addAll(ar);
		System.out.print(ll+" ");
		System.out.println();
		System.out.println("==============STACK================");
		Stack <String> sk=new Stack<String>();
		sk.add("thulasi");
		sk.add("kaveri");
		sk.add("teja");
		sk.add("suguna");
		sk.add("pichaiah");
		for(String i:sk)
		{
			System.out.println(i);
		}
		System.out.println();
		
		System.out.println(sk.peek());
		sk.pop();
		System.out.println(sk);
		sk.push("pichaiah2");
		System.out.println(sk);
		
		System.out.println("===========PRIORITY QUEUE============");
		PriorityQueue <String> pq=new PriorityQueue<String>();
		pq.add("thulasi");
		pq.add("kaveri");
		pq.add("teja");
		pq.add("suguna");
		pq.add("pichaiah");
		System.out.println(pq);
		System.out.println(pq.peek());
		pq.poll();
		System.out.println(pq);
		pq.offer("ramlal");
		Iterator<String> itr=pq.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}
		System.out.println();
		
		System.out.println("============HASHSET============");
		HashSet<Integer>hs=new HashSet<Integer>();
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(40);
		hs.add(50);
		hs.add(50);
		hs.add(null);
		System.out.println(hs);
		
		System.out.println("=========LINKED HASHSET===========");
		LinkedHashSet <Integer> lh=new LinkedHashSet<Integer>();
		lh.add(10);
		lh.add(20);
		lh.add(30);
		lh.add(30);
		lh.add(40);
		lh.add(50);
		lh.add(50);
		lh.add(null);
		System.out.println(lh);
		
		System.out.println("============TREESET==============");
		TreeSet <Integer> ts=new TreeSet<Integer>();
		ts.add(50);
		ts.add(40);
		ts.add(30);
		ts.add(20);
		ts.add(10);
		System.out.println(ts);
		System.out.println(ts);
		
	
		System.out.println("==============HASHMAP===============");
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(1, null);
		hm.put(2, null);
		hm.put(null, null);
		hm.put(2, null);
		System.out.println(hm);
		
		System.out.println("=============LINKED HASHMAP=========");
		LinkedHashMap<Integer,String>lm=new LinkedHashMap<Integer,String>();
		lm.put(1, null);
		lm.put(2, null);
		lm.put(null, null);
		lm.put(2, null);
		System.out.println(lm);
		
		System.out.println("==============TREEMAP==============");
		TreeMap<Integer,String>tm=new TreeMap<Integer,String>();
		tm.put(3, null);
		tm.put(1, null);
		tm.put(2, null);
		//tm.put(null, null);
		tm.put(2, null);
		System.out.println(tm);
		
		
		
		
		
		
		
		
	}

}
