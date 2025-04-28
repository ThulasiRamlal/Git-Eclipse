 package com.crudOperation;

import java.util.List;
import java.util.Scanner;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class MobileCRUDAPP {
	public static void main(String[] args) {
		
	try
	{
		while(true) {
		System.out.println("WELCOME TO CRUD OPERATION BY USING HIBERNATE");
		System.out.println("ENTER CHOICE FOR PERFORM OPERATION");
		System.out.println("CHOICE 1 : CREATE");
		System.out.println("CHOICE 2 : READ");
		System.out.println("CHOICE 3 : UPDATE");
		System.out.println("CHOICE 4 : DELETE");
		int choice=scan.nextInt();
		switch(choice)
		{
		case 1:MobileCRUDAPP.create();
		break;
		case 2:MobileCRUDAPP.read();
		break;
		case 3:MobileCRUDAPP.updateMain();
		break;
		case 4:MobileCRUDAPP.delete();
		break;
		default:System.out.println("ENTER VALID CHOICE NUMBER");
		}
		System.out.println("YOU WANT TO CONTINUE Y / N");
		 String dec = scan.next();
		 if(dec.toUpperCase().equals("N")) {
			 break;
		 }
		}
		System.out.println();
		System.out.println();
		System.out.println("================THANK'S FOR VISIT=================");		
	}
	catch(Exception e)
	{
		InputMismatchApp m=new InputMismatchApp();
		m.main(args);
		System.out.println();
		System.out.println();
		System.out.println("================THANK'S FOR VISIT=================");
		
	}
		
		
	}
	
	static Configuration con=(Configuration) new Configuration().
	configure("hibernate_class.xml");
	static SessionFactory sf=con.buildSessionFactory();
    static Session se=sf.openSession();
    static Transaction tr=se.beginTransaction();
    static Scanner scan=new Scanner(System.in);
    static MobileCRUD m=new MobileCRUD();
  
   
    public static void create()
  
    {
    	
	 //MobileCRUDAPP.details();
	 
		   try
		   {
	  System.out.print("Sno: ");
	  m.setSno(scan.nextInt());
	  System.out.println();
		   }
		   catch(Exception e)
	    	{
	    		InputMismatchApp m=new InputMismatchApp();
	    		m.main(null);
	    		return;
	    	}
	  
		   try
		   {
	  System.out.println("MobileBrand: ");
	  m.setBrand(scan.next());
	  System.out.println();
		   }
		   catch(Exception e)
	    	{
	    		InputMismatchApp m=new InputMismatchApp();
	    		m.main(null);
	    		return;
	    	}
	  
		   try
		   {
	  System.out.println("Version: ");
	  m.setVersion(scan.nextInt());
	  System.out.println();
		   }
		   catch(Exception e)
	    	{
	    		InputMismatchApp m=new InputMismatchApp();
	    		m.main(null);
	    		return;
	    	}
	  
		   try
		   {
	  System.out.println("RAM: ");
	  m.setRam(scan.next());
	  System.out.println();
		   }
		   catch(Exception e)
	    	{
	    		InputMismatchApp m=new InputMismatchApp();
	    		m.main(null);
	    		return;
	    	}
	  
		   try
		   {
	  System.out.println("ROM: ");
	  m.setRom(scan.next());
	  System.out.println();
		   }
		   catch(Exception e)
	    	{
	    		InputMismatchApp m=new InputMismatchApp();
	    		m.main(null);
	    		return;
	    	}
	  
		   try
		   {
	  System.out.println("Colur: ");
	  m.setColor(scan.next());
	  System.out.println();
		   }
		   catch(Exception e)
	    	{
	    		InputMismatchApp m=new InputMismatchApp();
	    		m.main(null);
	    		return;
	    	}
	  
		   try
		   {
	  System.out.println("Cost: ");
	  m.setCost(scan.nextInt());
	  System.out.println();
		   }
		   catch(Exception e)
	    	{
	    		InputMismatchApp m=new InputMismatchApp();
	    		m.main(null);
	    		return;
	    	}
	  
	  se.persist(m);
	  tr.commit();
	  

	  se.close();
	  System.out.println("Succesfully inserted");
	  }
	  
	  
	 
	  
    	
    	
  
    

   
    
  public static void read()
  
  
  {
	  System.out.println("WELCOME TO FETCHING THE RECORDS");
	  System.out.println("If U WANT FETCHING THE COMPLETE RECORDS ENTER CHOICE 1");
	  System.out.println("IF U WANT FETCHING SINGLE RECORD THEN ENTER CHOICE 2");
	  int choice =scan.nextInt();
	  switch(choice)
	  {
	  case 1:readEntire();
	  break;
	  case 2:readSingle();
	  break;
	  default : System.out.println("You Enterd Invalid Choice number");
	  }
	  
	 
	  
  }

  //Reads The ENtire Records methods
  public static void readEntire()
  {
	  List<MobileCRUD>read=se.createCriteria(MobileCRUD.class).list();
	  for(MobileCRUD r:read)
	  {
		  System.out.println("Sno: "+r.getSno()+" , BRAND: "+r.getBrand()+" , VERSION: "+
	  r.getVersion()+" , RAM: "+r.getRam()+" , ROM: "+r.getRom()
	  +" , COLOUR: "+r.getColor()+" , COST: "+r.getColor()
				  );
	  }
	  System.out.println("SUCCESSFULLY FETCHING ENTIRE RECORD FROM DATA");
	  tr.commit();
	  se.close(); 
  }
  //Method of Reads The Single Record From Data 
  public static void readSingle()
  {
	  System.out.println("ENTER ID FOR FETCHING SINGLE RECORD");
	  int id=scan.nextInt();
	  if(m!=null)
	  {
		  
		  
	  
	  MobileCRUD m=(MobileCRUD) se.get(MobileCRUD.class,id);
	  System.out.println("Sno: "+m.getSno()+" , BRAND: "+m.getBrand()+" , VERSION: "+
			  m.getVersion()+" , RAM: "+m.getRam()+" , ROM: "+m.getRom()
			  +" , COLOUR: "+m.getColor()+" , COST: "+m.getColor()
						  );
	  System.out.println("SUCCESSFULLY FETCHING SINGLE RECORD FROM THE DATA");
	  
  }
	  else
	  {
		  System.out.println("ID IS NOT PRESENT IN DATA");
	  }
  }
  
  
  //Delete method
  public static void delete()
  {
	  try
	  {
	  System.out.println("ENTER ID FOR DELETING RECORD");
	  int id=scan.nextInt();
	  MobileCRUD m=(MobileCRUD)se.get(MobileCRUD.class, id); 
	  if(m!=null)
	  {
		  se.delete(m);
		  System.out.println("SUCCESSFULL DELETED ROW NO: "+id);
		  tr.commit();
		  se.close();
		  
	  }
	  else
	  {
		  System.out.println("ID IS NOT PRESENT IN DATA");
	  }
	  }
	  catch(Exception e)
	  	{
	  		InputMismatchApp m=new InputMismatchApp();
	  		m.main(null);
	  		return;
	  	}
	   
  }
  
  //Update method
  public static void singleDataUpdate()
  {
	  System.out.println("WELCOME TO UPDATE OPERATION.....");
	  System.out.println("ENTER CHOICE FOR UPDATE OPERATION");
	  System.out.println("1.Sno");
	  System.out.println("2.Brand");
	  System.out.println("3.Version");
	  System.out.println("4.Ram");
	  System.out.println("5.Rom");
	  System.out.println("6.Colour");
	  System.out.println("7.Cost");
	  
	  int choice=scan.nextInt();
	 switch(choice)
	 {
	 case 1:sNo();
	 break;
	 case 2:brand();
	 break;
	 case 3:version();
	 break;
	 case 4:ram();
	 break;
	 case 5:rom();
	 break;
	 case 6:color();
	 break;
	 case 7:cost();
	 break;
	 default:System.out.println("YOU ENTERED INVALID CHOICE NUMBER");
	 }
	  
  }
  public static void updateMain()
  {
	  try
	  {

	  System.out.println("WELCOME TO UPDATE THE RECORDS");
	  System.out.println("If U WANT UPDATE THE SINGLE RECORD AT A TIME ENTER CHOICE 1");
	  System.out.println("IF U WANT UPDATE SINGLE DATA IN RECORD THEN ENTER CHOICE 2");
	  int id=scan.nextInt();
	  switch(id)
	  {
	  case 1:rowUpdate();
	  break;
	  case 2:singleDataUpdate();
	  break;
	  default :System.out.println("YOU ENTERED INVALID CHOICE NUMBER");
	  }
	  }
	  catch(Exception e)
	  { 
  		InputMismatchApp m=new InputMismatchApp();
		  		m.main(null);
		  		return;
		   
	  }
	  
  }
  //Update Methods
  public static void sNo()
  
  
  {
	  try
	  {
	  System.out.println("ENTER ID FOR SNO UPDATE");
	  int id=scan.nextInt();
		MobileCRUD m=(MobileCRUD) se.get(MobileCRUD.class, id);
		if(m!=null)
		{
			System.out.println("ENTER DATA FOR SNO");
			int sno=scan.nextInt();
			m.setSno(sno);
			se.update(m);
			tr.commit();
			System.out.println("Successfully updated");
			se.close();
		}
		else
		{
			System.out.println("Updatee not possible as ID for not found");
		}
	  }
		  catch(Exception e)
		  	{
		  		InputMismatchApp m=new InputMismatchApp();
		  		m.main(null);
		  		return;
		  	}
  }
  public static void brand()
  {
	  try
	  {
	  System.out.println("ENTER ID FOR BRAND NAME UPDATE");
	  int id=scan.nextInt();
		MobileCRUD m=(MobileCRUD) se.get(MobileCRUD.class, id);
		if(m!=null)
		{
			System.out.println("ENTER DATA FOR BRAND");
			String brand=scan.next();
			m.setBrand(brand);
			se.update(m);
			tr.commit();
			System.out.println("Successfully updated");
			se.close();
		}
		else
		{
			System.out.println("Updatee not possible as ID for not found");
		}
	  }
	  catch(Exception e)
	  	{
	  		InputMismatchApp m=new InputMismatchApp();
	  		m.main(null);
	  		return;
	  	}
	  
  }
  public static void version()
  {
	  try
	  {
	  System.out.println("ENTER ID FOR VERSION UPDATE");
	  int id=scan.nextInt();
		MobileCRUD m=(MobileCRUD) se.get(MobileCRUD.class, id);
		if(m!=null)
		{
			System.out.println("ENTER DATA FOR VERSION");
			int version=scan.nextInt();
			m.setVersion(version);
			se.update(m);
			tr.commit();
			System.out.println("Successfully updated");
			se.close();
		}
		else
		{
			System.out.println("Update not possible as ID for not found");
		}
	  }
	  catch(Exception e)
	  	{
	  		InputMismatchApp m=new InputMismatchApp();
	  		m.main(null);
	  		return;
	  	}
	  
  }
  public static void ram()
  {
	  try
	  {
	  System.out.println("ENTER ID  FOR RAM UPDATE");
	  int id=scan.nextInt();
		MobileCRUD m=(MobileCRUD) se.get(MobileCRUD.class, id);
		if(m!=null)
		{
			System.out.println("ENTER DATA FOR RAM");
			String ram=scan.next();
			m.setRam(ram);
			se.update(m);
			tr.commit();
			System.out.println("Successfully updated");
			se.close();
		}
		else
		{
			System.out.println("Updatee not possible as ID for not found");
		}
	  }
	  catch(Exception e)
	  	{
	  		InputMismatchApp m=new InputMismatchApp();
	  		m.main(null);
	  		return;
	  	}
	  
  }
  public static void rom()
  {
	  try
	  {
	  System.out.println("ENTER ID FOR FOR ROM UPDATE");
	  int id=scan.nextInt();
		MobileCRUD m=(MobileCRUD) se.get(MobileCRUD.class, id);
		if(m!=null)
		{
			System.out.println("ENTER DATA FOR ROM");
			String rom=scan.next();
			m.setRom(rom);
			se.update(m);
			tr.commit();
			System.out.println("Successfully updated");
			se.close();
		}
		else
		{
			System.out.println("Updatee not possible as ID for not found");
		}
	  }
	  catch(Exception e)
	  	{
	  		InputMismatchApp m=new InputMismatchApp();
	  		m.main(null);
	  		return;
	  	}
	  
  }
  public static void color()
  {
	  try
	  {
	  System.out.println("ENTER ID FOR COLOUR UPDATE");
	  int id=scan.nextInt();
		MobileCRUD m=(MobileCRUD) se.get(MobileCRUD.class, id);
		if(m!=null)
		{
			System.out.println("ENTER DATA FOR COLOUR");
			String color=scan.next();
			m.setColor(color);
			se.update(m);
			tr.commit();
			System.out.println("Successfully updated");
			se.close();
		}
		else
		{
			System.out.println("Updatee not possible as ID for not found");
		}
	  }
	  catch(Exception e)
	  	{
	  		InputMismatchApp m=new InputMismatchApp();
	  		m.main(null);
	  		return;
	  	}
	  
  }
  public static void cost()
  {
	  try
	  {
	  System.out.println("ENTER ID FOR COST UPDATE");
	  int id=scan.nextInt();
		MobileCRUD m=(MobileCRUD) se.get(MobileCRUD.class, id);
		if(m!=null)
		{
			System.out.println("ENTER DATA FOR COST");
			int cost=scan.nextInt();
			m.setCost(cost);
			se.update(m);
			tr.commit();
			System.out.println("Successfully updated");
			se.close();
		}
		else
		{
			System.out.println("Updatee not possible as ID for not found");
		}
	  }
	  catch(Exception e)
	  	{
	  		InputMismatchApp m=new InputMismatchApp();
	  		m.main(null);
	  		return;
	  	} 
  }
 
public static void rowUpdate()
  {
	  try
	  {
	  System.out.println("ENTER ID FOR ENTIRE ROW UPDATION AT A TIME");
	  int id=scan.nextInt();
	  MobileCRUD m=new MobileCRUD();
	  if(m!=null)
	  {
		  System.out.println("ENTER ID ");
		  int id1=scan.nextInt();
		  m.setSno(id1);
		  System.out.println("ENTER BRAND ");
		  String brand=scan.next();
		  m.setBrand(brand);
		  System.out.println("ENTER VERSION ");
		  int version=scan.nextInt();
		  m.setVersion(version);
		  System.out.println("ENTER RAM ");
		  String ram=scan.next();
		  m.setRam(ram);
		  System.out.println("ENTER ROM ");
		  String rom=scan.next();
		  m.setRom(rom);
		  System.out.println("ENTER COLOUR ");
		  String colour=scan.next();
		  m.setColor(colour);
		  System.out.println("ENTER COST ");
		  int cost =scan.nextInt();
		  m.setCost(cost);
		  se.update(m);
		  tr.commit();
		  se.close();
		  System.out.println("SUCCESFULL UPDATED");
		  
	  }
	  else
	  {
		  System.out.println("Updatee not possible as ID for not found"); 
	  }
	  }
	  catch(Exception e)
	  {
		  InputMismatchApp m=new InputMismatchApp();
		  m.main(null);
		  return;
	  }
	  
	  
	  
	  
  }

}
