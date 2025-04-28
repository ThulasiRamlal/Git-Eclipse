package com.collection3;

import java.util.Iterator;
import java.util.Vector;

public class Vector1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector <String>teja= new Vector<String>();
		teja.add("thulasi");
		teja.add(null);
		teja.add(null);
		//Fetching the data through Iterator()
		Iterator<String> teja2=teja.iterator();
		while(teja2.hasNext())
		{
			System.out.println(teja2.next());
		}

	}

}
