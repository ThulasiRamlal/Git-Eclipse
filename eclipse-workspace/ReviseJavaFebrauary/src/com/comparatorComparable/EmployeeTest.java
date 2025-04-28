package com.comparatorComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.comparatorComparable.Employee.SortId;

public class EmployeeTest {
	public static void main(String[] args) {
		
	
	List<Employee> s=new ArrayList<Employee>();
	s.add(new Employee(3,"thulasi",27,90));
	s.add(new Employee(2,"Teja",23,78));
	s.add(new Employee(4,"kaveri",21,80));
	s.add(new Employee(1,"suguna",22,94));
	
	List<String>s1=s.stream().map(a->a.getName()).collect(Collectors.toList());
	//System.out.println(s1);
	
 //List<Integer>a=s.stream().filter(d->d.getMarks()).sorted().collect(Collectors.toList());
	
	List<Employee>q=s.stream().collect(Collectors.toList());
	//System.out.println(q);
	
	
	}
		
	}


