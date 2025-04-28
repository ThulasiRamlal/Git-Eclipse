package com.groupingBy;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;


public class Employee1Test {
	public static void main(String[] args) {
		List<Employee1>teja=new  ArrayList<Employee1>();
		teja.add(new Employee1(1,"thulasi","Pune"));
		teja.add(new Employee1(2,"Ramlal","bangloore"));
		teja.add(new Employee1(3,"teja","bangloore"));
		teja.add(new Employee1(4,"kaveri","pune"));
		teja.add(new Employee1(5,"raju","chittor"));
		teja.add(new Employee1(6,"Ajith","chennai"));	
		teja.add(new Employee1(7,"suguna","delhi"));
		teja.add(new Employee1(8,"Ajith","delhi"));
		
		
		//grouping by Locations
		Map<String,List<Employee1>> teja2=teja.stream().collect(Collectors.groupingBy(a->a.getLocation()));
	System.out.println(teja2);
	System.out.println("===================================");
	//Grouping by name
	Map<String,List<Employee1>> teja3=teja.stream().collect(Collectors.groupingBy(Employee1::getName));
	System.out.println(teja3);
	//by using entry set
	
	}

}
