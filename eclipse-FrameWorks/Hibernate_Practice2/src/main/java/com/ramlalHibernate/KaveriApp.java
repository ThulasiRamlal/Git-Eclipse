package com.ramlalHibernate;


import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;



public class KaveriApp {

	public static void main(String[] args) {
        // Activates the Hibernate Framework...
        Configuration con = new Configuration();
        con.configure("hibernate_class.xml");
       // System.out.println("Successfully connected...");

        // Reads entire configuration
        SessionFactory sf=con.buildSessionFactory();
       // System.out.println("Successfully built Session Factory..");

        // Create connection between Java to the Database
        Session se = sf.openSession();

        Transaction tr = null;
        try {
            tr = se.beginTransaction();
            
            Kaveri k = new Kaveri();
            k.setId(1);
            k.setName("Kaveri");
            k.setMaths(90);
            k.setPhy(92);
            k.setChem(93);
            
            se.save(k);
            tr.commit();
            System.out.println("Successfully inserted...");
        } catch (Exception e) {
            if (tr != null) tr.rollback();
            e.printStackTrace();
        } finally {
            se.close();
        }
    }
}
