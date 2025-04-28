package com.thulasiHibernate;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TejaUpdate {
	public static void main(String[] args) {
        Configuration con = new Configuration();
        con.configure("ProjectThree.xml");
        SessionFactory sf = con.buildSessionFactory();
        Session se = sf.openSession();
        
        Scanner scan = new Scanner(System.in);
        boolean continueUpdating = true;

        while (continueUpdating) {
            Transaction tr = se.beginTransaction();

            // Prompt user for ID
            System.out.println("Enter ID for UPDATE Record (or enter 0 to exit): ");
            int id = scan.nextInt();

            // If user enters 0, break the loop
            if (id == 0) {
                System.out.println("Exiting update process...");
                continueUpdating = false;
                break;
            }

            
            // Retrieve record by ID
            Teja t = (Teja) se.get(Teja.class, id);
            if (t != null) {
                System.out.println("Enter updated NAME for record with ID " + id + ": ");
                String name = scan.next();
                t.setName(name);  // Assuming there's a setName method

                // Update the record in the database
                se.update(t);
                System.out.println("Successfully updated record with ID " + id);
            } 
            else {
                System.out.println("Record with ID " + id + " not found in the database.");
            }

            // Commit the transaction
            tr.commit();

            // Ask if user wants to continue
            System.out.println("Do you want to update another record? (yes/no): ");
            String response = scan.next();
            if (response.equalsIgnoreCase("no")) {
                continueUpdating = false;
                System.out.println("Exiting update process...");
            }
        }

        // Close session
        se.close();
    }
}
