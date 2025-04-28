package com.school;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class School2 {
	public static void main(String[] args) {
		
		Configuration con=new Configuration();
		con.configure("NewFile8.xml");
		SessionFactory sf=con.buildSessionFactory();
		Session se=sf.openSession();
		Transaction tr=se.beginTransaction();
		List<Student>s=se.createCriteria(Student.class).list();
		for(Student s1:s)
		{
			System.out.println("Student_Id: "+s1.getStudent_id()+" Student_Name: "+s1.getName()
					+" Student_Class: "+s1.getStudent_class()+" Student_Gender: "+s1.getGender()+" Sudent_School: "+s1.getSchool_name());
		}
		

	}

}
