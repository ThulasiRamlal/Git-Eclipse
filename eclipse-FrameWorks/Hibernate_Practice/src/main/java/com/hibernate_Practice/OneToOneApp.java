package com.hibernate_Practice;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class OneToOneApp {
	
	public static void main(String[] args) {
		Configuration con=new Configuration();
		con.configure("NewFile.xml");
		
		//builSessionFactroy reads entire Configuration
		SessionFactory sf=con.buildSessionFactory();
		
		//Session responsible for Establishing 
		//Connection between JAVA code to DATABASE
		Session se=sf.openSession();
		
		//For modification purpose
		
		Transaction tr=se.beginTransaction();
		
		AddressOne a = new AddressOne();
		a.setDno(2-39);
		a.setCity("Chittoor");
		a.setState("Andhra Pradesh");
		
		EmployeeOne e = new EmployeeOne();
		e.setId(1);
		e.setName("Thulasi");
		e.setGender("Male");
		e.setSalary(40000.89f);
		e.setAdd(a);
		
		
		se.save(e);
		tr.commit();
		System.out.println("Data inserted successfully...!");
	}

}
