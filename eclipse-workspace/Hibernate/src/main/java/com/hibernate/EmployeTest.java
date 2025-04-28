package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeTest {
	
	public static void main(String[] args) {
		Configuration con = new Configuration();
		con.configure("NewFile.xml");
		SessionFactory sf = con.buildSessionFactory();
		Session se = sf.openSession();
		se.beginTransaction();
		Transaction tr = se.beginTransaction();
		
		Employee e = new Employee();
		e.setId(3);
		e.setName("Ramlal");
		e.setRole("Java Developer");
		e.setSalary(300000);
		e.setGender("Male");
		
	    se.save(e);
	    tr.commit();
	    System.out.println("Data inserted successfully...!");
	    se.close();
		
		
	}
	
	

}
