package com.collections2;

import java.util.List;
import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> teja=new LinkedList<>();
		teja.add(10);
		teja.add(20);
		teja.add(30);
		//System.out.println(teja);
		LinkedList<Integer> teja2 = new LinkedList<Integer>();
        teja2.add(40);
        teja2.add(50);
        teja2.addAll(teja);
       // System.out.println(teja2);
        teja2.add(0, 10);
       // System.out.println(teja2);
     teja.clear();
    // System.out.println(teja);
     teja2.contains(40);
   //  System.out.println(teja2);
     //teja2.descendingIterator();
     
    // teja2.get(4);
    System.out.println(teja2.get(4));
	}

}
