package com.manyToMany;

import java.util.List;

import org.hibernate.Session;

import com.hibernate_Practice.Hibernate_Util;

public class ManyToManyData {
	
	public static void main(String[] args) {
		Session se = Hibernate_Util.getSession();
		
		
		//list()->to convert the rows into list
		List<MyInstitute> inList = se.createCriteria(MyInstitute.class).list();
		
		for(MyInstitute i : inList) {
			System.out.println("Institue Id : "+i.getId()+", Institute Name : "+i.getName()+", Location : "+i.getLocation());
			List<MyStudent> stuList = i.getSlist();
			stuList.forEach(
					(s)->System.out.println("Student Id : "+s.getId()+", Student Name : "+s.getName()+", Course : "+s.getCourse())
					
					);
			System.out.println("------------------------------------------------------------------------------------");
		}
	}

}
