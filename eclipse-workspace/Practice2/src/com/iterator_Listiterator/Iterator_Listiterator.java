package com.iterator_Listiterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iterator_Listiterator {
	public static void main(String[] args) {
		ArrayList<Integer> teja=new ArrayList<>();
		teja.add(1);
		teja.add(2);
		teja.add(3);
		teja.add(4);
		//System.out.println(teja);
		ListIterator<Integer> teja2=teja.listIterator();
		while(teja2.hasNext())
		{
			System.out.println(teja2.next());
		}
		System.out.println("--------------------------");
		while(teja2.hasPrevious())
		{
			System.out.println(teja2.previous());
		}
		
	}
	}


