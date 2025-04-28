import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeTest {
	public static void main(String[] args) {
		//Activates the hibernate framework
		
		Configuration con=new Configuration();
		con.configure("Hibernate4.xml");
		
		//It reads entire Configuration
		SessionFactory sf=con.buildSessionFactory();
		//Create the established Connection between
		//Java Progaram tot he database
		Session se=sf.openSession();
		se.beginTransaction();
		Transaction tr=se.beginTransaction();
		
		//Creating the object Employee class
		
		Employee e=new Employee();
		Employee e1=new Employee();
		e.setEmpId(5);
		e.setEmpName("Ramlal");
		e.setDept("developer");
		e.setSalary(50000);
		
		e1.setEmpId(6);
		e1.setEmpName("Ramlal1");
		e1.setDept("Testing ");
		e1.setSalary(60000);
		
		
		se.save(e);
		se.save(e1);
		tr.commit();
		System.out.println("Successfully inserted data");
		se.close();
		
	}

}
