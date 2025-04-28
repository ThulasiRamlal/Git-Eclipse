package com.ramlalHibernate;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class KaveriApp2 {
	public static void main(String[] args) {
		Configuration con= new Configuration();
		
		con.configure("hibernate_class.xml");
		System.out.println("Succefully Configuration...");
		
		SessionFactory sf=con.buildSessionFactory();
		System.out.println("Succefully Session Factory...");
		
	}

}
