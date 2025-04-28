package com.crud;

import java.util.List;
import java.util.Scanner;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StudentRead {
	
	static Configuration con=null;
	static SessionFactory sf=null;
	static Session se=null;
	static Transaction tr=null;
	
	
	public static void main(String[] args) {
		  con=new Configuration();
		  con.configure("hibernateFebraury.xml");
		  sf=con.buildSessionFactory();
		  se=sf.openSession();
	      tr=se.beginTransaction();
	     

	}
	
	
	
	public static void fetchById()
	{
		try
		{
		Scanner scan = new Scanner(System.in);
			System.out.println("enter ID for Read the In database....");
			int id=scan.nextInt();
			Student st1=(Student) se.get(Student.class, id);
			System.out.println("ID | Name | Maths | Physics | Chemistry ");
			if(st1!=null)
			{
				System.out.println(st1.getId()+" "+st1.getName()+
						" "+st1.getMaths()+" "+st1.getPhysics()+" "+st1.getChemistry());
			}
			else
			{
				System.out.println("not found details....based on ID");
			}
		} 
		catch (HibernateException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	
	public static void fetchByAll()
	{
		
		
		System.out.println("ID  |  Name  |  Maths  |  Physics  |  Chemistry  ");
		List<Student>student=se.createCriteria(Student.class).list();
		for(Student s:student)
		{
			
			System.out.println(s.getId()+"  |  "+s.getName()+"  |  "+s.getMaths()+
					"  |  "+s.getPhysics()+"  |  "+s.getChemistry());
		}
		System.out.println("SUCCEFULLY FETCHED ALL DETAILS.......");
		
		
	}
	

}
