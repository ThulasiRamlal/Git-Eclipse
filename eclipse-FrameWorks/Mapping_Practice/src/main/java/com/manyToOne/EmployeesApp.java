package com.manyToOne;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class EmployeesApp {
	public static void main(String[] args) {
		Configuration con=new Configuration();
		con.configure("Mapping_Practice.xml");
		SessionFactory sf=con.buildSessionFactory();
		Session se=sf.openSession();
		Transaction tr=se.beginTransaction();
		
		//Entity CLass Object
		Department d=new Department();
		d.setDname("Mech");
		
		Department d1=new Department();
		d1.setDname("CSE");
		
		Employees e=new Employees();
		e.setName("Thulasi");
		e.setDept(d);
		
		Employees e1=new Employees();
		e1.setName("teja");
		e1.setDept(d);
		
		Employees e3=new Employees();
		e3.setName("kaveri");
		e3.setDept(d1);
		
		Employees e4=new Employees();
		e4.setName("Ramlal");
		e4.setDept(d1);
		
		se.save(e);
		se.save(e1);
		se.save(e3);
		se.save(e4);
		tr.commit();
		System.out.println("Succefully inserted");
	}

}
