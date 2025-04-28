package com.thulasiHibernate;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TejaDelete {
	public static void main(String[] args) {
		
		Configuration con=new Configuration();
		con.configure("ProjectThree.xml");
		SessionFactory sf=con.buildSessionFactory();
		Session se=sf.openSession();
		Transaction tr=se.beginTransaction();
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter ID for Delete Record IN Table...");
		int id=scan.nextInt();
		Teja t=(Teja) se.get(Teja.class, id);
		if(t!=null)
		{
			se.delete(t);
			System.out.println("Succefully deleted...");
		}
		else
		{
			System.out.println("Delete Unsucefull...");
		}
		tr.commit();
		se.close();
	}

}
