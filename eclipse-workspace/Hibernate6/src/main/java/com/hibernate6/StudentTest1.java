package com.hibernate6;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StudentTest1 {
	public static void main(String[] args) {
		
		//Activates The Hibernate Framework
				Configuration con=new Configuration();
				
				con.configure("Hibernate6.xml");
				//Read all Configuration file details(or)XML file
				SessionFactory sf=con.buildSessionFactory();
				//Create connection between Java Progarm To DataBase
				Session se=sf.openSession();
				
				
		
			
		
	}

}
