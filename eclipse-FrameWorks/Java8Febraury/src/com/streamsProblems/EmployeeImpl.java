package com.streamsProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeImpl {
	
	public static void main(String[] args) {
		
		List<Employee>e=new ArrayList<Employee>();
		e.add(new Employee(1,"thulasi",22,24000));
		e.add(new Employee(2,"kaveri",15,12000));
		e.add(new Employee(3,"teja",26,22000));
		e.add(new Employee(4,"suguna",12,29000));
	    e.add(new Employee(5,"pichaiah",27,30000));
	    
	    System.out.println("====Partition People Based on Age=======");
	   // Write a stream pipeline that partitions people into two groups based
	    //on whether their age is above 30 or not.
	
	    Map<Boolean, List<Employee>>e1=e.stream().collect(Collectors.partitioningBy(s->s.getAge()>25));
	   System.out.println(e1);
	    System.out.println("====Find the Average Age of People in a List====");
	    Double e2=e.stream().collect(Collectors.averagingInt(s->s.getAge()));
	    System.out.println("Average age: "+e2);
	    System.out.println("==================");
	    IntSummaryStatistics e3=e.stream().collect(Collectors.summarizingInt(s->s.getAge()));
	    System.out.println(e3.getAverage());
	    
	    System.out.println("=====Employees Names======");
	    List<String>e4=e.stream().map(w->w.getName()).collect(Collectors.toList());
	    System.out.println(e4);
	    
	    System.out.println("=====Employee Names in Sorting Order====");
	    String e5=e.stream().map(s->s.getName()).sorted(Comparator.reverseOrder()).collect(Collectors.joining("' , '", "[ '","' ] "));
	System.out.println(e5);
	}

}
