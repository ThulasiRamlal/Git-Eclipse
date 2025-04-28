import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class EmployeeGet {
	public static void main(String[] args) {
		
		Configuration con= new Configuration();
		con.configure("hibernate_class.xml");
		SessionFactory sf=con.buildSessionFactory();
		Session se=sf.openSession();
		//Transaction tr= se.beginTransaction();
		
		
			List<Employee>e1=se.createCriteria(Employee.class).list();
	for(Employee e:e1)
	{
		System.out.println(" ID: "+e.getId()+", Name:"+e.getName()
	+" ,Salary:"+e.getSalary()+" ,Email: "+
				e.getEmail()+" ,Phno: "+e.getPhno());
}
	
//		Employee e=(Employee) se.get(Employee.class, 2);
//		if(e!=null)
//		{
//			System.out.println(" ID: "+e.getId()+", Name:"+e.getName()
//			+" ,Salary:"+e.getSalary()+" ,Email: "+
//						e.getEmail()+" ,Phno: "+e.getPhno());
//		}
//		else
//		{
//			System.out.println("Employee ID is not present Employee Table ");
//		}
		
//		Employee e2=(Employee) se.get(Employee.class, 3);
//		
//		if(e2!=null)
//		{
//				System.out.println(" ID: "+e2.getId()+", Name:"+e2.getName()
//				+" ,Salary:"+e2.getSalary()+" ,Email: "+
//							e2.getEmail()+" ,Phno: "+e2.getPhno());
//			}
//			else
//			{
//				System.out.println("Employee ID is not present Employee Table ");
//			}
		
		
		
		
		
				
		
	}
	
	
	}
	


