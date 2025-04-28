package com.oneToOne;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class PersonApp {
	public static void main(String[] args) {
		Configuration con=new Configuration();
		con.configure("Mapping_Practice.xml");
		SessionFactory sf=con.buildSessionFactory();
		Session se=sf.openSession();
		Transaction tr=se.beginTransaction();
		
		//Entity Class Objects
		PassPort pp=new PassPort();
		pp.setPassportNumber("54321");
		
		//Entity CLass OBject
		Person p=new Person();
		p.setName("Thulasi");
		p.setPassport(pp);
		
	se.save(p);
	tr.commit();
	se.close();
	System.out.println("Succefully inserted");
	}

}
