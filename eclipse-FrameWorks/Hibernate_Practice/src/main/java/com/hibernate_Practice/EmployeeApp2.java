package com.hibernate_Practice;



import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;


public class EmployeeApp2 {
	public static void main(String[] args) {
		Configuration con=new Configuration();
		con.configure("NewFile.xml");
		SessionFactory sf=con.buildSessionFactory();
		Session se=sf.openSession();
		List <Employee>l=se.createCriteria(Employee.class).list();
		
		//By using createCriteria() method we 
				//can fetching Data from database in console
		for(Employee e:l)
		{
			System.out.println("Id: "+e.getId()+" Name: "+e.getName()+
					" Salary: "+e.getSalary()+" Gender: "+e.getGender());
			
		}
		System.out.println("=======================================================");
		
		
		//By using createQuery() method we 
		//can fetching Data from database in console
		
		List<Employee>l1=se.createQuery("from Employee").list();
		l1.forEach((em)->System.out.println("Id: "+em.getId()+" Name: "+em
				.getName()+
				" Salary: "+em.getSalary()+" Gender: "+em.getGender()));
		
		
	}

}
