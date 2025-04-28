package com.hibernate_Practice;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class OneToManyApp {
	
	public static void main(String[] args) {
		OneToManyApp o=new OneToManyApp();
		o.OneToManyinsert();
		
		
	}
	
//	public void OneToManyGet()
//	{
//		
//		
//		CollegeOne c=new CollegeOne();
//		DepartmentOne d=new DepartmentOne();
//		System.out.println("C_id: "+c.getC_Id()+" C_name: "+c.getC_name()+" C_location: "+c.getC_location()+" "+
//		c.getList().);
//		
//		
//	}
		
		public void OneToManyinsert()
		{
		Session se = Hibernate_Util.getSession();
		Transaction tr = se.beginTransaction();
		
		DepartmentOne d = new DepartmentOne();
		d.setId(1);
		d.setD_name("ECE");
		d.setD_fees("34877");
		
		
		DepartmentOne d1 = new DepartmentOne();
		d1.setId(2);
		d1.setD_name("EEE");
		d1.setD_fees("25877");
		
		DepartmentOne d2 = new DepartmentOne();
		d2.setId(3);
		d2.setD_name("CIVIL");
		d2.setD_fees("54877");
		
		
		CollegeOne c = new CollegeOne();
		c.setId(100);
		c.setC_name("SKUCET");
		c.setC_location("Anantapur");
		
		ArrayList<DepartmentOne> dlist = new ArrayList<DepartmentOne>();
		dlist.add(d);
		dlist.add(d1);
		dlist.add(d2);
		
		c.setList(dlist);
		
		se.save(c);
		tr.commit();
		//se.close();
		System.out.println("Data inserted successfully...!");
	
		
	}

}
