package com.comparable;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Employee1Test {
	public static void main(String[] args) {
		List<Employee1>t=new ArrayList<Employee1>();
		t.add(new Employee1("thulasi",21,91));
		t.add(new Employee1("suguna",43,95));
		t.add(new Employee1("kaveri",22,94));
		t.add(new Employee1("pichaih",50,87));
		t.add(new Employee1("teja",21,94));
		Collections.sort(t);
		System.out.println("=======================SORTING AGE====================");
		System.out.println(t);
		System.out.println("=================SORTING MARKS=====================");
		System.out.println();
	}

}
