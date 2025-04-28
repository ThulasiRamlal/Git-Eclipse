package com.thulasiHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TejaApp {
	public static void main(String[] args) {
		
		Configuration con=new Configuration();
		con.configure("ProjectThree.xml");
		SessionFactory sf=con.buildSessionFactory();
		Session se=sf.openSession();
		Transaction tr=se.beginTransaction();
		Teja t=new Teja();
		t.setId(4);
		t.setName("Ramlal");
		
		Teja t1=new Teja();
		t1.setId(5);
		t1.setName("teja");
		se.save(t);
		se.save(t1);
		tr.commit();
		se.close();
		System.out.println("Succefully inserted....");
		
	}

}
