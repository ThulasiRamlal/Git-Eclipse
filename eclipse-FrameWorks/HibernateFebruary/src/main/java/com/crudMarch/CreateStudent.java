package com.crudMarch;

import java.io.Serializable;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CreateStudent {
	
	public static void main(String[] args)
	{
		
		Scanner scan=new Scanner(System.in);
		
		Configuration con=new Configuration();
		con.configure("hibernateFebraury.xml");
		System.out.println("Succefully Configuartion");
		SessionFactory sf=con.buildSessionFactory();
		Session se=sf.openSession();
		Transaction tr=se.beginTransaction();
		
		//Creating Entity Class Object
		
		try
		{
		
		//Transient State
		Student s=new Student();
		int count=0;
		System.out.println("Enter The NAME....");
		String name=scan.next();
		s.setName(name);
		
		System.out.println("Enter The AGE.....");
		int age=scan.nextInt();
		s.setAge(age);
		
		System.out.println("Enter The MARKS....");
		int marks=scan.nextInt();
		s.setMarks(marks);
		
		
		//Persitant State
	     se.save(s);
		//(or)
		//se.persist(s);
	       tr.commit();
		 count++;
		System.out.println("Succefully inserted...."+count+" ...ROW...");
		
		
		
		}
		catch(Exception e)
		{
				
				System.out.println("SOME WHERE YOU DID MISTAKE PLEASE VERIFY..");
				tr.rollback();
				System.out.println("Succefully ROLLBACK THE ENTIRE APPLICATION....");
				e.printStackTrace();
			
			
		}
		finally
		{
			if(scan!=null)
			{
				
				scan.close();
				//detached state
				se.close();
				sf.close();
				System.out.println("Succefully CLOSE ALL CONNECTION.....");
				
			}
		}
		
	
	
	}
}
