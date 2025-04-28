import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class EmployeeApp {
	public static void main(String[] args) {
		Configuration con=new Configuration();
		con.configure("hibernate_class.xml");
		SessionFactory sf=con.buildSessionFactory();
		Session se=sf.openSession();
		Transaction tr=se.beginTransaction();
		Employee e=new Employee();
		e.setName("thulasi");
		e.setSalary(10000);
		e.setEmail("thulasi@gmail.com");
		e.setPhno(7337277);
		Employee e2=new Employee();
		e2.setName("kaveri");
		e2.setSalary(20000);
		e2.setEmail("kaveri@gmail.com");
		e2.setPhno(96763052);
		se.save(e);
		se.persist(e2);
		tr.commit();
		System.out.println("One row affected succesfully");
	}

}
