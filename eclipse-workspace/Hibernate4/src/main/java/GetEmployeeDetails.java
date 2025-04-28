import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class GetEmployeeDetails {

	public static void main(String[] args) {
		/*
		 * Configuration con=new Configuration(); con.configure("Hibernate4.xml");
		 * 
		 * //It reads entire Configuration SessionFactory sf=con.buildSessionFactory();
		 * //Create the established Connection between //Java Progaram tot he database
		 * Session se=sf.openSession();
		 * Hibernate_Util
		 */
		Hibernate_Util h=new Hibernate_Util();
	     Session se =  h.getSession();
	
	     //using createCriteria() to get the data from database
		List<Employee> plist = se.createCriteria(Employee.class).list();
		
		for(Employee e : plist) {
			System.out.println("Id : "+e.getEmpId()+" Name : "+e.getEmpName()+" Dept : "+e.getDept()+" Salary : "+e.getSalary());;
		}
		System.out.println("===================================================");
		//using createQuery() to get the data from database
		List<Employee> emplist = se.createQuery("from Employee").list();
		emplist.forEach((em)->System.out.println("Id : "+" Name : "+em.getEmpName()+" Dept : "+em.getDept()+" Salary : "+em.getSalary()
				));
		
		
	}

}
