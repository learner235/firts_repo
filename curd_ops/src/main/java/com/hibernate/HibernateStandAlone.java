package com.hibernate;
import org.hibernate.Session;
import java.util.List;
import com.entity.*;

public class HibernateStandAlone {
	
	
	@SuppressWarnings("unchecked")
	public static void main(String [] args)
	{
		Employees emp =new Employees();
		emp.setEmp_no(334);
		emp.setBirth_date("1995.1.1");
		emp.setFirst_name("Oseen");
		emp.setLast_name("gupta");
		emp.setGender("F");
		emp.setHire_date("2019.2.2");
		
		Session session =HibenateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.persist(emp);
		
		List<Employees> emps = (List<Employees>)session.createQuery("from Employees").list();
		
		for(Employees e: emps)
		{
			System.out.println("Details are "+e);
		}
		session.getTransaction().commit();
		session.close();
	}

}
