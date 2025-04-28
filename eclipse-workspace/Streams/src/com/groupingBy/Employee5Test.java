package com.groupingBy;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Employee5Test {
	public static void main(String[] args) {
		List<Employee5>teja=new ArrayList<Employee5>();
		teja.add(new Employee5(1,"thulasi","pune",25000));
		teja.add(new Employee5(2,"RAMLAL","CHENNAI",35000));
		teja.add(new Employee5(3,"kaveri","chittor",22000));
		teja.add(new Employee5(4,"suguna","pune",20000));
		teja.add(new Employee5(5,"teja","delhi",25000));
		teja.add(new Employee5(6,"pichaiah","pune",5000));
		teja.add(new Employee5(7,"ajith","bang",200));
		teja.add(new Employee5(8,"raju","mumbai",254000));
		Map<String, List<Employee5>>teja3=teja.stream().collect(Collectors.groupingBy(Employee5::getLocation));
		System.out.println(teja3);
		
	}

}
