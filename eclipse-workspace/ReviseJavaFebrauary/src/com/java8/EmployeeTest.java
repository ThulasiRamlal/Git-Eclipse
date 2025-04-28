package com.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeTest {
	
	
	public static void main(String[] args) {
		
   List<Employee>e=new ArrayList<Employee>();
   e.add(new Employee(1,"thulasi","chennai",1000));
   e.add(new Employee(2,"teja","Banglore",1100));
   e.add(new Employee(3,"kaveri","delhi",1100));
   e.add(new Employee(4,"suguna","chennai",900));
   e.add(new Employee(5,"Pichaih","chittor",1100));
   e.add(new Employee(6,"kaveri","mumbai",1100));
   
   Map<String,List<Employee>>e1=e.stream().collect(Collectors.groupingBy(s->s.getLocation()));
		System.out.println(e1);
	
		System.out.println("============================");
	Map<Integer, List<Employee>>e2=e.stream().collect(Collectors.groupingBy(s->s.getSalary()));
		System.out.println(e2);
	
	}

}
