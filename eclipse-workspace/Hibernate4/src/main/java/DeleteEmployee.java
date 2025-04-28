import org.hibernate.Session;
import org.hibernate.Transaction;

public class DeleteEmployee {
	
	public static void main(String[] args) {
          Session se = Hibernate_Util.getSession();
          Transaction tr = se.beginTransaction();
          
        
            Employee emp = (Employee) se.get(Employee.class, new Integer(4));
            se.delete(emp);
            tr.commit();
            System.out.println("Deleted one row successfully...!");
            
	}

}
