package com.manyToMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate_Practice.Hibernate_Util;

public class ManyToManySaveData {
	
	public static void main(String[] args) {
		Session se = Hibernate_Util.getSession();
		Transaction tr = se.beginTransaction();
		
		MyInstitute i1 = new MyInstitute();
		i1.setName("Kodnest");
		i1.setLocation("BTM 2nd stage");
		
		MyInstitute i2 = new MyInstitute();
		i2.setName("Tap Academy");
		i2.setLocation("Marathalli");
		
		MyStudent s1 = new MyStudent();
		s1.setName("Thulasi");
		s1.setCourse("Back-end developer");
		
		MyStudent s2 = new MyStudent();
		s2.setName("Ramlal");
		s2.setCourse("Full Stack developer");
		
		List<MyStudent> m = new ArrayList<MyStudent>();
		m.add(s1);
		m.add(s2);
		
		List<MyInstitute> ilist = new ArrayList<MyInstitute>();
		ilist.add(i1);
		ilist.add(i2);
		
		
		i1.setSlist(m);
		i2.setSlist(m);
		
		s1.setIlist(ilist);
		s1.setIlist(ilist);
		
		se.save(i1);
		se.save(i2);
		se.save(s1);
		se.save(s2);
		tr.commit();
		System.out.println("Data inserted successfully...!");
		
	}

}
