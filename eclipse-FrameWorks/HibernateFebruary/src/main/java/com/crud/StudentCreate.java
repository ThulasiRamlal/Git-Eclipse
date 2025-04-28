package com.crud;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StudentCreate {
	public static void main(String[] args) {
		Configuration con=new Configuration();
		con.configure("hibernateFebraury.xml");
		SessionFactory sf=con.buildSessionFactory();
		Session se=sf.openSession();
		Transaction tr=se.beginTransaction();
		Scanner scan=new Scanner(System.in);
		System.out.println("Sucefully Connection to database done....");
		
		try
		{
		//Create Entity class Object
		Student st =new Student();
		//st.setId(1);
		System.out.println("Enter name Adding...");
		String name=scan.next();
		st.setName(name);
		
		System.out.println("Enter Maths marks..");
		int maths=scan.nextInt();
		st.setMaths(maths);
		
		System.out.println("Enter Physics marks..");
		int physics=scan.nextInt();
		st.setPhysics(physics);
		
		System.out.println("Enter Chemistry marks..");
		int chemistry=scan.nextInt();
		st.setChemistry(chemistry);
		
		se.save(st);
		//se.persist(st);
		tr.commit();
		System.out.println("Succefully inserted....");
		}
		
		catch(Exception e)
		{
			if(tr!=null)
			{
				tr.rollback();
				System.out.println("SOME WHERE YOU DID A MISTAKE ...PLEASE VERIFY...");
				e.printStackTrace();
			}
		}
		finally
		{
			if(scan!=null)
			{
				scan.close();
				sf.close();
				se.close();
				System.out.println("Succefully Connection closed.....");
				
			}
		}
		
		}
		
		
		
	}
	


