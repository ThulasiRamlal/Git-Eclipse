package com.collection3;

import java.util.LinkedList;
import java.util.List;

public class LinkedList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>teja =new LinkedList<String>();
		teja.add("thulasi");
		teja.add("kaveri");
		teja.add("teja");
		
		LinkedList<String> teja2=new LinkedList<String>();
		teja2.add("Suguna");
		teja2.add("Pichaiah");
		teja2.add("Nagamma");
		
		//Linked list is combining two list into one list
		//teja.addAll(teja2);
		//System.out.println(teja);
		teja2.addAll(teja);
		System.out.println(teja2);
		
		LinkedList<String> teja3 =new LinkedList<String>();
		teja3.add("raju");
		teja3.add("Ajith");
		teja3.add("Eswar");
		teja3.addAll(teja2);
		System.out.println(teja3);
	

	}

}
