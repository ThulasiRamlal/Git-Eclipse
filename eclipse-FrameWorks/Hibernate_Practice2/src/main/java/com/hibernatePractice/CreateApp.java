package com.hibernatePractice;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class CreateApp {
	public static void main(String[]args)
	{
		Configuration con=new Configuration();
		con.configure("hibernate_class.xml");
		System.out.println("Succefully Configuration..");
		SessionFactory sf=con.buildSessionFactory();
		System.out.println("Succefully SessionFactory.....");
		
	}

}
