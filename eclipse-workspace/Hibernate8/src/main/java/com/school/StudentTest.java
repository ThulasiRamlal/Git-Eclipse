package com.school;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StudentTest {
	public static void main(String[] args) {
		Session se = null;
				Transaction tr=se.beginTransaction();
		//EntityClass Object
		//Transient state
		Student s=new Student();
		s.setStudent_id(1);
		s.setName("Ramlal");
		s.setGender("male");
		s.setStudent_class("10 class");
		s.setSchool_name("RGUKT");
		//2nd record
		s.setStudent_id(2);
		s.setName("Ramlal1");
		s.setGender("male");
		s.setStudent_class("11 class");
		s.setSchool_name("IITN");
		//3rd record
		s.setStudent_id(3);
		s.setName("Ramlal3");
		s.setGender("male");
		s.setStudent_class("12 class");
		s.setSchool_name("");
		//4th record
		s.setStudent_id(4);
		s.setName("Ramlal4");
		s.setGender("male");
		s.setStudent_class("14 class");
		s.setSchool_name("IITN");
		
		//peristant state
		se.save(s);
		tr.commit();
		//Detached state
		se.close();
	}
}
