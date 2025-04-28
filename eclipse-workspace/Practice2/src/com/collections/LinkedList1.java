package com.collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedList1 {
	
		
		public static void main(String[] args) {
			List<Integer> list = new LinkedList<>();
			LinkedList<Integer> list1 =new LinkedList<>();
			list1.add(10);
			list1.add(20);
			list1.add(2);
			list1.add(40);
			list1.add(80);
			list1.add(5);
			list1.add(80);
			
			list.add(200);
			list.add(300);
			

			list1.addAll(list);
			System.out.println(list1);

}
}
