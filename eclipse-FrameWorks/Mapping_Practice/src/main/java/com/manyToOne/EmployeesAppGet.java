package com.manyToOne;

import java.util.Iterator;
import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class EmployeesAppGet {
	public static void main(String[] args) {
		Configuration con=new Configuration();
		con.configure("Mapping_Practice.xml");
		SessionFactory sf=con.buildSessionFactory();
		Session se=sf.openSession();
		Transaction tr=se.beginTransaction();
		
	List<Employees>e1=se.createCriteria(Employees.class).list();
	for(Employees e:e1)
	{
		System.out.println("E_id: "+e.getId()+" , E_name: "+e.getName());
				
	}
	System.out.println("Succesfully fetching");
		
	tr.commit();
	}
	

}
