package com.collections;
import java.util.*;

public class LinkedList3 {

	public static void main(String[] args) {
		//Creating 1st List
		List<String> teja =new LinkedList<String>();
		//System.out.println(teja);
		teja.add("Thulasi");
		teja.add("kaveri");
		//System.out.println("teja:"+teja);
		
		//Creating 2nd List
		LinkedList<String> teja2= new LinkedList<String>();
		teja2.add("Pichaiah");
		teja2.add("Suguna");
		//System.out.println(teja2);
		teja2.addAll(teja);
		//System.out.println("teja2: "+teja2);
		
		//Creating 3rd list
		LinkedList<String> teja3 = new LinkedList<String>();
		teja3.add("Ramlal");
		teja3.add("Teja");
		teja3.addAll(teja2);
		//System.out.println(teja3);
		//System.out.println("teja3: "+teja3);
		
		//methods
		//add method with index
		teja3.add(0,"Thulasi");
		System.out.println("add with index:"+teja3);
		//add first
		teja3.addFirst("Kaveri");
		System.out.println("Addfirst: "+teja3);
		//add last
		teja3.addLast("Thulasi");
		System.out.println("AddLast: "+teja3);
		//contains
		teja3.contains("tulasi");
		System.out.println("contains: "+teja3);
		//size
		teja.size();
		System.out.println("size: "+teja);
		//remove with index
		teja3.remove(0);
		System.out.println("remove: "+teja3);
		//remove first
		teja3.removeFirst();
		System.out.println("RemoveFirst: "+teja3);
		//remove last
		teja3.removeLast();
		System.out.println("Remove Last: "+teja3);
		//get with index
		teja3.get(3);
		System.out.println("Get: "+teja3);
		//getFirst
		teja3.getFirst();
		System.out.println("Get First: "+teja3);
	}

}
