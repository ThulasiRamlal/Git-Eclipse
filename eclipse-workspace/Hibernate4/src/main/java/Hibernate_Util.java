import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Hibernate_Util {
	
	public static Session getSession() {
		Configuration con = new Configuration();
		con.configure("Hibernate4.xml");
		SessionFactory sf = con.buildSessionFactory();
		Session se = sf.openSession();
		return se;
	}

}
