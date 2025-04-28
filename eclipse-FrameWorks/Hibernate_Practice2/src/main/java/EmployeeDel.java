import java.util.Scanner;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class EmployeeDel {
	public static void main(String[] args) {
		Configuration con=new Configuration();
		con.configure("hibernate_class.xml");
		SessionFactory sf=con.buildSessionFactory();
		Session se=sf.openSession();
		Scanner scan=new Scanner(System.in);
		Transaction tr=se.beginTransaction();
		
		
		System.out.println("Enter ID for which row u Want delete");
		int id=scan.nextInt();
		Employee e=(Employee) se.get(Employee.class, id);
		if(e!=null)
		{
			se.delete(e);
			System.out.println("One row Deleted succesfully");
		}
		else
		{
			System.out.println("ID not present in Employee table");
		}
		
		tr.commit();
		se.close();
		sf.close();
		
		
	}

}
