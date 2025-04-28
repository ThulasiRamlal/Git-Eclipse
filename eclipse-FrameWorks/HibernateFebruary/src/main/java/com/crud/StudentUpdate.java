package com.crud;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StudentUpdate {
	public static void main(String[] args) {
		
		Configuration con =new Configuration();
		con.configure("hibernateFebraury.xml");
		SessionFactory sf=con.buildSessionFactory();
		Session se=sf.openSession();
		Transaction tr=se.beginTransaction();
		Scanner scan=new Scanner(System.in);
		
		try
		{
	
	System.out.println("Enter ID for Update");
	int id=scan.nextInt();
	
	Student st1=(Student)se.get(Student.class, id);
	if(st1!=null)
	{
		System.out.println("Enter NAME...");
		String name=scan.next();
		st1.setName(name);
		
		System.out.println("Enter MATHS...");
		int maths=scan.nextInt();
		st1.setMaths(maths);
		
		System.out.println("Enter PHYSICS...");
		int physics=scan.nextInt();
		st1.setPhysics(physics);
		
		System.out.println("Enter CHEMISTRY...");
		int chemistry=scan.nextInt();
		st1.setChemistry(chemistry);
		
	
		se.update(st1);
		tr.commit();
		System.out.println("Successfull UPDATED in Table...");
	}
	else
	{
		
		System.out.println("NOT FOUND ID: "+id+" IN TABLE...");
	}
	
	}
		catch(Exception e)
		{
			tr.rollback();
			System.out.println("SOME WHERE U DID MISTAKE.....");
			e.printStackTrace();
		}
		finally
		{
			se.close();
			sf.close();
			scan.close();
			System.out.println("Succefully CLosed Connection....");
			
		}
		
		
	}

}
