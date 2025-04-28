package com.jdbs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Transaction2_jdbc {
	

	
	    public static void main(String[] args)
	    {
	        Connection con = null;
	        PreparedStatement pstmt1 = null;
	        PreparedStatement pstmt2 = null;
	        Scanner scan = new Scanner(System.in);

	        try {
	            // Register the Driver
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            System.out.println("Driver registered successfully.");
	            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kodnest", "root", "Ramlal@123");
	            System.out.println("Connected to the database.");

	            // Disable Auto-Commit
	            con.setAutoCommit(false);

	            // Prepare SQL Statements
	            String sql1 = "UPDATE kodBank SET acc_balance = acc_balance - ? WHERE acc_no = ?";
	            String sql2 = "UPDATE kodBank SET acc_balance = acc_balance + ? WHERE acc_no = ?";
	            pstmt1 = con.prepareStatement(sql1);
	            pstmt2 = con.prepareStatement(sql2);

	            // Input Transfer Details
	            System.out.println("Enter From Account Number, and To Account Number And Amount");
	           
	            int facc = scan.nextInt();
	            int tacc = scan.nextInt();
	            int amt = scan.nextInt();

	            // Update Statements
	            pstmt1.setInt(1, amt);
	            pstmt1.setInt(2, facc);
	            pstmt2.setInt(1, amt);
	            pstmt2.setInt(2, tacc);

	            int rows1 = pstmt1.executeUpdate();
	            int rows2 = pstmt2.executeUpdate();

	            if (rows1 > 0 && rows2 > 0) 
	            {
	                con.commit();
	                System.out.println("Transaction completed successfully.");
	            } 
	            else 
	            {
	               System.out.println("Transcation Completed Unsuccesfull");
	            }

	        } 
	        catch (Exception e)
	        {
	        	try
				{
					System.out.println("Some Error Occured IN transaction But Your Money Safe");
			     con.rollback();
			     
			
				}
				catch(Exception e1)
				{
					e.printStackTrace();
				}
	        } 
	        finally
	        {
	            try {
	                if (pstmt1 != null) pstmt1.close();
	                if (pstmt2 != null) pstmt2.close();
	                if (con != null) con.close();
	                if (scan != null) scan.close();
	            } 
	            catch (Exception e) 
	            {
	                e.printStackTrace();
	            }
	        }
	    }
	}



