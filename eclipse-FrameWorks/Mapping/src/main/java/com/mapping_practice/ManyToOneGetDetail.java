package com.mapping_practice;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class ManyToOneGetDetail {
	public static void main(String[] args) {
		Configuration con=new Configuration();
		con.configure("Mapping.xml");
		SessionFactory sf=con.buildSessionFactory();
		Session se=sf.openSession();
List<Group>l=se.createCriteria(Group.class).list();
for(Group g:l)
{
	

	System.out.println("id: "+g.getId()+" , GName:"+g.getGname()
	+" , Branch:"+g.getBranch()+" , Fees:"+g.getFees()+" , Clg_ID:"+
			g.getClg().getId()+" , Clg_Name: "+g.getClg().getCname()+
			" , Clg_Lcn:"+g.getClg().getClocation());
}
System.out.println("succesfully fetcing");
	}

}
