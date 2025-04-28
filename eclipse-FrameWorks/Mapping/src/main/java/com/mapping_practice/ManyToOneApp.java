
package com.mapping_practice;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ManyToOneApp {
	
	public static void main(String[] args) {
		Configuration con=new Configuration();
		con.configure("Mapping.xml");
		SessionFactory sf=con.buildSessionFactory();
		Session se=sf.openSession();
		Transaction tr=se.beginTransaction();
		
		College c = new College();
		c.setId(1);
		c.setCname("SKU");
		c.setClocation("ATP");
		
		Group g = new Group();
		g.setId(12);
		g.setGname("A");
		g.setBranch("ECE");
		g.setFees(57886);
		g.setClg(c);
		
		Group g1 = new Group();
		g1.setId(13);
		g1.setGname("A");
		g1.setBranch("ECE");
		g1.setFees(57886);
		g1.setClg(c);
		
		Group g2 = new Group();
		g2.setId(14);
		g2.setGname("A");
		g2.setBranch("ECE");
		g2.setFees(57886);
		g2.setClg(c);
		
		se.save(g);
		se.save(g1);
		se.save(g2);
		tr.commit();
		se.close();
		System.out.println("Data inserted succesfully...!");
		
	}

}
