package com.map;
import java.util.*;

public class HashMap1 {
	public static void main(String[] args) {
		//it does not allow any duplicate values
		//it does not follow any insertion order
		//it allow null value only once
		HashMap<Integer,String> teja=new HashMap<Integer,String>();
		teja.put(1, "thulasi");
		teja.put(2, null);
		teja.put(3, "teja");
		teja.put(5, null);
		teja.put(null, null);
		teja.put(null, null);
		System.out.println(teja);
		
	}

}
