package com.groupingBy;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Employee7test {
	public static void main(String[] args) {
		List<Employee7>teja=new ArrayList<Employee7>();
		teja.add(new Employee7(1,"thulasi","pune"));
		teja.add(new Employee7(2,"teja","chenai"));
		teja.add(new Employee7(3,"kaveri","delhi"));
		teja.add(new Employee7(4,"thulasi","bangloore"));
		teja.add(new Employee7(5,"ramlal","pune"));
		teja.add(new Employee7(5,"ramlal","chennai"));
		
		Map<String,List<Employee7>>teja2=teja.stream().collect(Collectors.groupingBy(Employee7::getLocation));
		System.out.println(teja2);
		System.out.println("========================[");
		//==========================================================
		Map<String,List<Employee7>>teja3=teja.stream().collect(Collectors.groupingBy(Employee7::getName));
		System.out.println(teja3);
	}

}
