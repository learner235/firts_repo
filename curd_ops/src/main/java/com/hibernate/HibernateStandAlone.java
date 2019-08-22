package com.hibernate;
import org.hibernate.Session;
import java.util.List;
import com.entity.*;

public class HibernateStandAlone {
	
	
	@SuppressWarnings("unchecked")
	public static void main(String [] args)
	{
		Employees emp =new Employees();
		emp.setBirthDate("1995.1.1");
		emp.setFirstName("Oseen");
		emp.setLastName("gupta");
		emp.setGender("F");
		emp.setHireDate("2019.2.2");
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.save(emp);
		
		List<Employees> emps = (List<Employees>)session.createQuery("from Employees").list();
		
		for(Employees e: emps)
		{
			System.out.println("Details are "+e.getEmpNo());
			System.out.println("Details are "+e.getFirstName());
			System.out.println("Details are "+e.getLastName());
			System.out.println("Details are "+e.getHireDate());
			System.out.println("Details are "+e.getGender());
			System.out.println("Details are "+e.getBirthDate());
			System.out.println();
		}
		session.getTransaction().commit();
		session.close();
	}

}
