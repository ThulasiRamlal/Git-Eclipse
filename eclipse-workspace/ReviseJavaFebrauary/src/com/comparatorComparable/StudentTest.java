package com.comparatorComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentTest {
	
	public static void main(String[] args) {
		
		List<Student> s=new ArrayList<Student>();
		s.add(new Student(3,"thulasi",27,90));
		s.add(new Student(2,"Teja",23,78));
		s.add(new Student(4,"kaveri",21,80));
		s.add(new Student(1,"suuna",22,94));
		
//		System.out.println("========SortingBy Age=============");
//		Collections.sort(s);
//		System.out.println(s);
		
		System.out.println("===========SortingBy Id=================");
		Collections.sort(s);
		System.out.println(s);
		
	}

}
