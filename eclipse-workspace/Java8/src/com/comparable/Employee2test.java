package com.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Employee2test {
	public static void main(String[] args) {
		List<Employee2>t=new ArrayList<Employee2>();
		t.add(new Employee2("thulasi",21,91));
		t.add(new Employee2("suguna",43,95));
		t.add(new Employee2("kaveri",22,94));
		t.add(new Employee2("pichaih",50,87));
		t.add(new Employee2("teja",21,94));
	Comparator<Employee2>t2=new Comparator<Employee2>() {

		@Override
		public int compare(Employee2 o1, Employee2 o2) {
			// TODO Auto-generated method stub
			return o1.name.compareTo(o2.name);
		}
		
	};
	Collections.sort(t,t2);
	System.out.println("===========================NAME SORTING==================");
	System.out.println(t);

}
}
