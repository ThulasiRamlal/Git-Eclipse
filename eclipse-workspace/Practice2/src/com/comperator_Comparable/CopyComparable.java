package com.comperator_Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CopyComparable implements Comparable<CopyComparable>{
	
		
		int id;
		String name;

		public CopyComparable(int id,String name) {
			this.id=id;
			this.name=name;
		}
		public String toString() {
			return "Id is : "+id+", Name : "+name;
		}
		@Override
		public int compareTo(CopyComparable e) {
			// TODO Auto-generated method stub
			return this.id-e.id;
		}
		
		public static void main(String[] args) {
			List<CopyComparable> list = new ArrayList<>();
			list.add(new CopyComparable(8, "Thulasi"));
			list.add(new CopyComparable(2, "Nani"));
			list.add(new CopyComparable(1, "Pishpa"));
			list.add(new CopyComparable(3, "Ajith"));
			list.add(new CopyComparable(10, "Ramlal"));
			
			Collections.sort(list);
			System.out.println(list);
			
			Comparator<CopyComparable> c = new Comparator<CopyComparable>() {
				
				@Override
				public int compare(CopyComparable o1, CopyComparable o2) {
					// TODO Auto-generated method stub
					return o1.name.compareTo(o2.name);
				}
			};
			Collections.sort(list, c);
			System.out.println(list);
		}
	}


