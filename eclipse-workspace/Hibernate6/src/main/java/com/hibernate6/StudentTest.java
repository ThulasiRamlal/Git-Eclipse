package com.hibernate6;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StudentTest {
	public static void main(String[] args) {
		//Activates The Hibernate Framework
		Configuration con=new Configuration();
		
		con.configure("Hibernate6.xml");
		//Read all Configuration file details(or)XML file
		SessionFactory sf=con.buildSessionFactory();
		//Create connection between Java Progarm To DataBase
		Session se=sf.openSession();
		
		
		//Perform
		Transaction tr=se.beginTransaction();
		
		//Transient State
		Student s=new Student();
		s.setRoll(1);
		s.setName("Thulasi");
		s.setMarks(91);
		s.setDept("Mech");
		
		//Persiant state
		se.save(s);
		
		tr.commit();
		se.close();
		System.out.println("Succesfully inserted");
		
		
	  
		
	}

}
