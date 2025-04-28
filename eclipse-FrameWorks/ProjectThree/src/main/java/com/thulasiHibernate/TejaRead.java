package com.thulasiHibernate;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TejaRead {
	public static void main(String[] args) {
	Configuration con=new Configuration();
	con.configure("ProjectThree.xml");
	SessionFactory sf=con.buildSessionFactory();
	Session se=sf.openSession();
	Transaction tr=se.beginTransaction();
	Scanner scan=new Scanner(System.in);
	Teja t=new Teja();
	System.out.println("Enter Id For READ the DATA.....");
	int id=scan.nextInt();
	Teja t1=(Teja) se.get(Teja.class, id);
	if(t1!=null)
	{
		System.out.println("Id  |  Name");
		System.out.println(t1.getId()+" | "+t1.getName());
	}
	else
	{
		System.out.println("Not found record...");
	}
	
	se.close();
	System.out.println("Successfully READ.......");
	}
}
