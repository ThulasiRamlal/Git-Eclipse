package com.hibernate_Practice;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class EmployeeApp {
	public static void main(String[] args) {
		
		//Activates the HIBERNATE frameWork
		Configuration con=new Configuration();
		con.configure("NewFile.xml");
		
		//builSessionFactroy reads entire Configuration
		SessionFactory sf=con.buildSessionFactory();
		
		//Session responsible for Establishing 
		//Connection between JAVA code to DATABASE
		Session se=sf.openSession();
		
		//For modification purpose
		Transaction tr=se.beginTransaction();
		
		//Entity Class Object
		
		Employee e=new Employee();
		Employee e1=new Employee();
		Employee e2=new Employee();
		Employee e3=new Employee();
		
		e.setId(1);
		e.setName("Ramlal");
		e.setSalary(10000);
		e.setGender("male");
		
		e1.setId(2);
		e1.setName("Kaveri");
		e1.setSalary(20000);
		e1.setGender("female");
		
		e2.setId(3);
		e2.setName("Teja");
		e2.setSalary(30000);
		e2.setGender("male");
		
		e3.setId(4);
		e3.setName("Suguna");
		e3.setSalary(40000);
		e3.setGender("female");
		
		
		se.save(e);
		se.save(e1);
		se.save(e2);
		se.save(e3);
		
		
		tr.commit();
		System.out.println("Data Inserted Succesfull");
		se.close();
		
		
	}

}
