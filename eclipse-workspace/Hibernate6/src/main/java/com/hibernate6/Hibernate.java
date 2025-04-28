package com.hibernate6;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Hibernate {
	
public  Session hibernate()
{
	Configuration con =new Configuration();
	con.configure("Hibernate6.xml");
	SessionFactory sf=con.buildSessionFactory();
	Session se=sf.openSession();
	return se;
}
}
