package com.collections;
import java.util.*;

public class ArrayList1 {
public static void main(String[] args) {
		
		//ArrayList syntax
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(2);
		list.add(40);
		list.add(80);
		list.add(5);
		list.add(80);
		
		System.out.println(list);
		System.out.println("--------------Using For each Loop------------");
	
		
		//forEach loop
		for(int i : list) {
			System.out.println(i);
		}
		System.out.println("--------------Using Iterator--------------");
		//using Iterator
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		list.getFirst();
		System.out.println(list);
		
}

}
