package com.groupingBy;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Employee3Test {
	public static void main(String[] args) {
		List<Employee3>teja=new ArrayList<Employee3>();
		teja.add(new Employee3(1,"ramlal",25000,"Chennai"));
		teja.add(new Employee3(2,"Thulasi",30000,"Bangloore"));
		teja.add(new Employee3(3,"teja",45000,"Chennai"));
		teja.add(new Employee3(4,"kaveri",45000,"Chittor"));
		teja.add(new Employee3(5,"Ajith",19000,"tirupathi"));
		teja.add(new Employee3(6,"Raju",50000,"Chennai"));
		teja.add(new Employee3(7,"Naveen",40000,"pune") );
		//grouping by
		Map<Double,List<Employee3>>teja2=teja.stream().collect(Collectors.groupingBy(Employee3::getEmpSalary));
     // teja2.forEach(teja2);
	System.out.println(teja2);
	//Map<Double,List<Employee3>>teja3=teja.stream().filter().collect(null)
	
	}

}