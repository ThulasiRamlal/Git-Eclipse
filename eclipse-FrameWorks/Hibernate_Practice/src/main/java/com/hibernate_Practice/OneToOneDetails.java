package com.hibernate_Practice;

import java.util.List;

import org.hibernate.Session;

public class OneToOneDetails {
	
	public static void main(String[] args) {
		
		Session se = Hibernate_Util.getSession();
		
	List<EmployeeOne> elist = se.createCriteria(EmployeeOne.class).list();
	for(EmployeeOne e : elist) {
		System.out.println("Id : "+e.getId()+", Name : "+e.getName()+", Gender : "+e.getGender()+", Salary : "
	     +e.getSalary()+", D-no : "+e.getAdd().getDno()+", City : "+e.getAdd().getCity()+", State : "+e.getAdd().getState());
		
	}
	}

}
