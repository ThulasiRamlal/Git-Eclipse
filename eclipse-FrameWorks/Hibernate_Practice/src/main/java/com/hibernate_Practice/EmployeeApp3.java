package com.hibernate_Practice;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeApp3 {
	
	public static void main(String[] args) {
		Configuration con=new Configuration();
		con.configure("NewFile.xml");
		SessionFactory sf=con.buildSessionFactory();
		Session se=sf.openSession();
		Transaction tr=se.beginTransaction();
		
		Employee emp=(Employee) se.get(Employee.class, new Integer(2));
		 se.delete(emp);
		
		tr.commit();
		se.close();
		System.out.println("Deleted one row successfull");
		
		
		
		
	}

}
