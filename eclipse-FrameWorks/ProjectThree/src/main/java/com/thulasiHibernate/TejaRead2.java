package com.thulasiHibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TejaRead2 {
	public static void main(String[] args) {
		
	
	Configuration con=new Configuration();
	con.configure("ProjectThree.xml");
	SessionFactory sf=con.buildSessionFactory();
	Session se=sf.openSession();
	Transaction tr=se.beginTransaction();
	Teja t=new Teja();
	
	//entire table fetching...
	List<Teja>t1=se.createCriteria(Teja.class).list();
	//by using for each loop fetching the records...
	System.out.println("Id|  Name");
	System.out.println("_____________");
	for(Teja i:t1)
	{
		System.out.println(i.getId()+" | "+i.getName());
		
	}
	System.out.println("Succefully READ Entire Table...");
	se.close();
	
	
	}
}
