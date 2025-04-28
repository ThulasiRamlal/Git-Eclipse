package com.crudAprilProject;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StudentTest {
	static Configuration con=null;
	static SessionFactory sf=null;
	static Session se=null;
	static Transaction tr=null;
	static Scanner scan=new Scanner(System.in);
    static Student s=null;
	public static void main(String[] args) {
		
		
		
		
		//createStudent();
		//readStudent();
		
		//readById();
		//updateMethod();
		//deleteStudent();
		System.out.println("ENTER THE OPERATION YOU WANT TO PERFORM... ");
		System.out.println("1. ENTER '1' FOR CREATE OPERATION\n 2. ENTER '2' FOR READ OPERATION\n 3. ENTER '3' FOR UPDATE OPERATION\n"
				+ "4. ENTER '4' FOR DELETE OPERATION\n");
		
		int choice=scan.nextInt();
		
		switch(choice)
		{
		
		case 1:createStudent();
		break;
		case 2: readStudent();
		break;
		case 3: updateStudent();
		break;
		case 4: deleteStudent();
		break;
		default:System.out.println("YOU ENTERED OPTION IS NOT FOUND......");
		
		
		}
		
		
	}
	
	//CORE COMPONENTS OF HIBERNATE
	public static  void  coreComponents()
	{
		
		con=new Configuration().configure("hibernateFebraury.xml");
        sf=con.buildSessionFactory();
        se=sf.openSession();
        tr=se.beginTransaction();
	
	}
	
	
	//create method
	
	public static void createStudent()
	{
		
		System.out.println("WELCOME TO CREATE LIST OF STUDENTS....");
		
		coreComponents();
		s=new Student();
		
		System.out.println("Enter ID... ");
		int id=scan.nextInt();
		s.setId(id);
		
		System.out.println("Enter NAME...");
		String name=scan.next();
		s.setName(name);
		
		System.out.println("Enter MATHS_MARKS...");
		int maths=scan.nextInt();
		s.setMaths(maths);
		
		System.out.println("Enter PHY_MARKS...");
		int phy=scan.nextInt();
		s.setPhysics(phy);
		
		System.out.println("Enter CHEM_MARKS...");
		int chem=scan.nextInt();
		s.setChemistry(chem);
		
		se.save(s);
		
		tr.commit();
		
		System.out.println("SUCCESSFULLY INSERTED....");
		
		
		
	}
	
	
	//Read Method
	public static void readStudent()
	{
		
		System.out.println("WELOCOME TO FETCHING ENTIRE DATA...");
		s=new Student();
		coreComponents();
		List<Student>s1=se.createCriteria(Student.class).list();
		
		for(Student s2:s1)
		{
			System.out.println("ID: "+s2.getId()+" | NAME: "+s2.getName()+" | MATHS: "+s2.getMaths()+" | PHYSICS: "+s2.getPhysics()+
					" | CHEMISTRY: "+s2.getChemistry());
		}
		System.out.println("SUCCESSFULLY FETCHED...");
			
	}
	
	//Read Specfic Record Method
	public static void readByIdStudent()
	{
		
		System.out.println("WLECOME TO FETCHING BY ID.....");
		coreComponents();
		System.out.println("ENTER 'ID' FOR FETCHING.......");
		int id=scan.nextInt();
		Student s1=(Student) se.get(Student.class, id);
		
		if(s1!=null)
		{
			System.out.println("ID: "+s1.getId()+" | NAME: "+s1.getName()+" | MATHS: "+s1.getMaths()+" | PHYSICS: "+s1.getPhysics()+
					" | CHEMISTRY: "+s1.getChemistry());
			
			System.out.println("SUCCEFULL FETCHED "+id+" ROW");
		}
		else
		{
			System.out.println("NOT FOUND ID "+id+" FOR FETCHING.....");
		}
		
		
		
	}
	
	//Update method
	public static void updateStudent()
	{
		
		System.out.println("WELCOME TO UPDATE FEATURE");
	    System.out.println("Enter 'ID' FOR UPDATE....");
	    coreComponents();
	    int id=scan.nextInt();
	    
	    s=new Student();
	    Student s1=(Student)se.get(Student.class, id);
	    //==================================================================
	    if(s1!=null)
		{
	    	System.out.println(" FETCHING OLD ROW "+id+" RECORD...");
			System.out.println("ID: "+s1.getId()+" | NAME: "+s1.getName()+" | MATHS: "+s1.getMaths()+" | PHYSICS: "+s1.getPhysics()+
					" | CHEMISTRY: "+s1.getChemistry());
			
			
		}
	  
	    //=======================================================================
	    if(s1!=null)
	    {
	    System.out.println("ENTER NAME FOR UPDATE");
	    String name=scan.next();
	    s1.setName(name);
	    System.out.println("ENTER MATHS__MARKS FOR UPDATE");
	    int maths=scan.nextInt();
		s1.setMaths(maths);
		System.out.println("ENTER PHYSICS__MARKS FOR UPDATE");
		int phy=scan.nextInt();
		s1.setPhysics(phy);
		System.out.println("ENTER CHEMISTRY__MARKS FOR UPDATE");
		int chem=scan.nextInt();
		s1.setChemistry(chem);
		
		se.save(s1);
		
		tr.commit();
		//========================================================================
		System.out.println("AFTER UPDATE ROW "+id+" RECORD...");
		System.out.println("ID: "+s1.getId()+" | NAME: "+s1.getName()+" | MATHS: "+s1.getMaths()+" | PHYSICS: "+s1.getPhysics()+
				" | CHEMISTRY: "+s1.getChemistry());
		
		//========================================================================
	    }
	    else
	    	
	    {
	    	System.out.println("UNSUCCEFULL UPDATED ID NO "+id);
	    }
	  
		
		
	}
	
	
	//delete method
	
	public static void deleteStudent()
	{
		
		System.out.println("WELCOME TO DELETE FEATURE.....");
		
		coreComponents();
		
		System.out.println("ENTER 'ID' FOR DELETE....");
		int id=scan.nextInt();
		Student s=(Student) se.get(Student.class, id);
		if(s!=null)
		{
			se.delete(s);
			System.out.println("SUCCESFULLY DELETE ID NO "+id);

		}
		else
		{
			System.out.println("UNSUCCEFULL DELETED ID NO "+id);
		}	
	}
	
	
	
	
	
	
	
	public static void finallyy()
	{
		
		
		scan.close();
		se.close();
		sf.close();
		System.out.println("SUCCEFULLY CLOSED THE ALL CONNECTIONS......");
		
	}
	
	
	
	//=====================================================================================================
	
    public static void fieldUpdate()
    {
    	
    	
    	System.out.println("ENTER 'ID' FOR ROW FOR UPDATE....");
		int id=scan.nextInt();
		Student s1=(Student)se.get(Student.class, id);
		if(s1!=null)
		{
    	
    	//======================
		
		 System.out.println("ENTER THE CHOICE WHICH YOU WANT TO UPDATE FEILD... ");
    System.out.println(" 1. ENTER '1' FOR UPDATE 'NAME' FEILD\n 2. ENTER '2' FOR UPDATE 'MATHS_MARKS' FEILD\n "
    		+ "3. ENTER '3' FOR UPDATE 'PHYSICS_MARKS' FIELD\n 4. ENTER '4' FOR UPDATE 'CHEMISTRY_MARKS' FIELD\n ");
    int choice=scan.nextInt();
    switch(choice)
    {
    case 1:nameUpdate(id);
    break;
    case 2:mathsUpdate(id);
    break;
    case 3:physicsUpdate(id);
    break;
    case 4:chemistryUpdate(id);
    break;
    default:System.out.println("YOU ENTERED OPTION IS NOT FOUND......");
        }
		}
		else
		{
			System.out.println("ID '"+id+"' IS NOT FOUND FOR ROW UPDATE...");
		}
    	
    
    }
	
	
	
	
	
	
	
	
	
	//update field methods
	//name method
	public static void nameUpdate(int id)
	{

	Student s=(Student) se.get(Student.class, id);
		if(s!=null)
		{
			System.out.println("BEFORE UPDATE NAME = '"+s.getName()+"'");
			//===============================
			System.out.println("ENTER NAME FOR UPDATE IN ROW NO '"+id+"'");
			String name=scan.next();
			s.setName(name);
			se.save(s);
			tr.commit();
			System.out.println("SUCCESSFULL UPDATE NAME = '"+s.getName()+"'");
			
		}
		else
		{
			
			System.out.println("UNSUCCEFULL UPDATED NAME IN ROW NO '"+id+"'");
		}
		
		
	}
	
	//maths_marks method
	public static void mathsUpdate(int id)
	{

	Student s=(Student) se.get(Student.class, id);
	
		if(s!=null)
		{
			System.out.println("BEFORE UPDATE MATHS_MARKS = '"+s.getMaths()+"'");
			//========================
			System.out.println("ENTER MATHS_MARKS FOR UPDATE IN ROW NO '"+id+"'");
			int maths=scan.nextInt();
			s.setMaths(maths);
			se.save(s);
			tr.commit();
			System.out.println("SUCCESSFULL UPDATE MATHS_MARKS = '"+s.getMaths()+"'");
			
			
		}
		else
		{
			
			System.out.println("UNSUCCEFULL UPDATED MATHS_MARKS IN ROW NO '"+id+"'");
		}
		
		
		
	}
	
	//physics_method update
	public static void physicsUpdate(int id)
	{

		Student s=(Student) se.get(Student.class, id);
		if(s!=null)
		{
			System.out.println("BEFORE UPDATE MATHS_MARKS = '"+s.getPhysics()+"'");
			//==============================================
			System.out.println("ENTER PHYSICS_MARKS FOR UPDATE IN ROW NO '"+id+"'");
			int phys=scan.nextInt();
			s.setPhysics(phys);
			se.save(s);
			tr.commit();
			System.out.println("SUCCESSFULL UPDATE MATHS_MARKS = '"+s.getPhysics()+"'");
			
		}
		else
		{
			
			System.out.println("UNSUCCEFULL UPDATED PHYSICS_MARKS IN ROW NO '"+id+"'");
		}
		
	}
	
	//chemistry method update
	public static void chemistryUpdate(int id)
	{
		
		//=============================
		Student s=(Student) se.get(Student.class,id);
		if(s!=null)
		{
			System.out.println("BEFORE UPDATE CHEMISTRY_MARKS = '"+s.getChemistry()+"'");
			//===============================================================
			System.out.println("ENTER CHEMISTRY_MARKS FOR UPDATE IN ROW NO '"+id+"'");
			int chem=scan.nextInt();
			s.setChemistry(chem);
			se.save(s);
			tr.commit();
			System.out.println("SUCCESSFULL UPDATE CHEMISTRY_MARKS = '"+s.getChemistry()+"'");
		}
		else
		{
			
			System.out.println("UNSUCCEFULL UPDATED CHEMISTRY_MARKS IN ROW NO '"+id+"'");
		}
		
		
		
	}
	//=================================================================================
	
	public static void fieldDelete()
    {
    	
    	
    	System.out.println("ENTER 'ID' FOR ROW DELETE....");
		int id=scan.nextInt();
		Student s1=(Student)se.get(Student.class, id);
		if(s1!=null)
		{
    	
    	//======================
		
		 System.out.println("ENTER THE CHOICE WHICH YOU WANT TO DELETE FEILD... ");
    System.out.println(" 1. ENTER '1' FOR DELETE 'NAME' FEILD\n 2. ENTER '2' FOR DELETE 'MATHS_MARKS' FEILD\n "
    		+ "3. ENTER '3' FOR DELETE 'PHYSICS_MARKS' FIELD\n 4. ENTER '4' FOR DELETE 'CHEMISTRY_MARKS' FIELD\n ");
    int choice=scan.nextInt();
    switch(choice)
    {
    case 1:nameDelete(id);
    break;
    case 2:mathsDelete(id);
    break;
    case 3:PhysicsDelete(id);
    break;
    case 4:ChemistryDelete(id);
    break;
    default:System.out.println("YOU ENTERED OPTION IS NOT FOUND......");
        }
		}
		else
		{
			System.out.println("ID '"+id+"' IS NOT FOUND FOR ROW UPDATE...");
		}
    	
    
    }
	
	
	
	//======================================================
	//Delete sub-method
	
	public static void nameDelete(int id)
	{
		
		Student s=(Student) se.get(Student.class, id);
		
		if(s!=null)
		{
			System.out.println("BEFORE DELETE NAME = '"+s.getName()+"'");
			s.setName("null");
			se.save(s);
			tr.commit();
			System.out.println("AFTER DELETE NAME = '"+s.getName()+"'");
			
	
		}

		else
		{
			
			//System.out.println("UNSUCCEFULL DELETED NAME IN ROW NO '"+id+"'");
			System.out.println("NOT FOUND ID "+id+" FOR DELETE NAME.....");
		
		}
			
	}
	
	//maths marks filed for feild
	public static void mathsDelete(int id)
	{
		
	
		Student s=(Student) se.get(Student.class, id);
		
		if(s!=null)
		{
			System.out.println("BEFORE DELETE MATHS_MARKS = '"+s.getMaths()+"'");
			Integer m=0;
			s.setMaths(m);
			se.save(s);
			tr.commit();
			System.out.println("AFTER DELETE MATHS_MARKS = '"+s.getMaths()+"'");
			
	
		}

		else
		{
			
			//System.out.println("UNSUCCEFULL DELETED NAME IN ROW NO '"+id+"'");
			System.out.println("NOT FOUND ID "+id+" FOR DELETE MATHS_MARKS.....");
		
		}
		
			
	}
	
	public static void PhysicsDelete(int id)
	{
		
		
		Student s=(Student) se.get(Student.class, id);
		
		if(s!=null)
		{
			System.out.println("BEFORE DELETE PHYSICS_MARKS = '"+s.getPhysics()+"'");
			Integer p=0;
			s.setPhysics(p);
			se.save(s);
			tr.commit();
			System.out.println("AFTER DELETE PHYSICS_MARKS = '"+s.getPhysics()+"'");
		}

		else
		{
			
			//System.out.println("UNSUCCEFULL DELETED NAME IN ROW NO '"+id+"'");
			System.out.println("NOT FOUND ID "+id+" FOR DELETE PHYSICS_MARKS.....");
		}
			
	}	
	
	public static void ChemistryDelete(int id)
	{
		
		
		Student s=(Student) se.get(Student.class, id);
		
		if(s!=null)
		{
			System.out.println("BEFORE DELETE CHEMISTRY_MARKS = '"+s.getChemistry()+"'");
			Integer c=0;
			s.setChemistry(c);
			se.save(s);
			tr.commit();
			System.out.println("AFTER DELETE CHEMISTRY_MARKS = '"+s.getChemistry()+"'");
		}

		else
		{
			
			//System.out.println("UNSUCCEFULL DELETED NAME IN ROW NO '"+id+"'");
			System.out.println("NOT FOUND ID "+id+" FOR DELETE CHEMISTRY"
					+ "_MARKS.....");
		}
			
	}
	
	
	

}


