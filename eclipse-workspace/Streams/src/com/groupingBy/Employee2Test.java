package com.groupingBy;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Employee2Test {
	public static void main(String[] args) {
		List<Employee2>teja=new ArrayList<Employee2>();
		teja.add(new Employee2(1,"Ramlal",32));
		teja.add(new Employee2(2,"Ramlal",19));
		teja.add(new Employee2(4,"teja",19));
		teja.add(new Employee2(5,"kaveri",18));
		teja.add(new Employee2(6,"Suguna",18));
		//Map<Integer,List<Employee2>>teja2=teja.stream().collect(Collectors.groupingBy(Employee2::getAge));
		//System.out.println(teja2);
		Map<String,List<Employee2>>teja2=teja.stream().collect(Collectors.groupingBy(a->a.getName()));
		System.out.println(teja2);
		//grouping by in using entrySet
		//for(Entry<String,List<Employee2>> teja3:map.entry) {
			
		}
		
	}


