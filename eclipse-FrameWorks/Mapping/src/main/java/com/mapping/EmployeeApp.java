package com.mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeApp {
	public static void main(String[] args) {
		
		Configuration con=new Configuration();
		con.configure("Mapping.xml");
		SessionFactory sf=con.buildSessionFactory();
		Session se=sf.openSession();
		Transaction tr=se.beginTransaction();
		
		Address a1=new Address();
		a1.setDno(2-10);
		a1.setCity("chittoor");
		a1.setState("AP");
		
		Employee e1=new Employee();
		
		e1.setId(2);
	    e1.setName("Thulasi");
	    e1.setAge(21);
		e1.setSalary(20000);
		e1.setA(a1);
	
	se.save(e1);
	tr.commit();
	se.close();
	System.out.println("Succefull inserted");
	
	
	}

}
