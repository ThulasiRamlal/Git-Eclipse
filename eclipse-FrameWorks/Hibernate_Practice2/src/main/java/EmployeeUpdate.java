import java.util.Scanner;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class EmployeeUpdate {
	public static void main(String[] args) {
		Configuration con=new Configuration();
		con.configure("hibernate_class.xml");
		SessionFactory sf=con.buildSessionFactory();
		Session se=sf.openSession();
		Transaction tr=se.beginTransaction();
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter id for update");
		int id=scan.nextInt();
		Employee e=(Employee) se.get(Employee.class, id);
		if(e!=null)
		{
			e.setPhno(1234567);
			se.update(e);
			System.out.println("Successfully updated");
			
		}
		else
		{
			System.out.println("Updatee not possible as ID for not found");
		}
		tr.commit();
		se.close();
		sf.close();
		
		
	}

}
