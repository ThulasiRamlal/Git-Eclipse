package com.crudMarch;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ReadStudent {
	
	
	static Configuration con=null;
	static SessionFactory sf=null;
	static Session se=null;
	static Transaction tr=null;
	static Student s=null;
	static Scanner scan=null;
	public static void main(String[] args) {
		scan=new Scanner(System.in);
		con=new Configuration().configure("hibernateFebraury.xml");
		sf=con.buildSessionFactory();
		se=sf.openSession();
		tr=se.beginTransaction();
		
	//	findAll();
		findByID();
		
		
		
		
		
	}
	
	public static void findAll()
	{
		//READ ENTIRE DATA IN THE TABLE IN DATABASE
		 s=new Student();
		List<Student>se1=se.createCriteria(Student.class).list();
	
		for(Student s2:se1)
		{
			
		System.out.println("ID: "+s2.getId()+" NAME: "+s2.getName()+" AGE: "+s2.getAge()+" MARKS: "+s2.getMarks());
	
		}
		
	}
	
	public static void findByID()
	{
		
		//READ SPECFIC RECORD IN THE DATA BASE
		
		
		
		System.out.println("Enter ID fetching the record");
		int id=scan.nextInt();
		Student s3=(Student) se.get(Student.class, id);
		
		
		if(s3!=null)
		{
			System.out.println("ID: "+s3.getId()+" NAME: "+s3.getName()+" AGE: "+s3.getAge()+" MARKS: "+s3.getMarks());
		}
		
		
	}

	
}
