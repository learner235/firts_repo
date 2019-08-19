package com.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dao.EmployeesDAO;
import com.entity.Employees;

@Repository
public class EmployeesDAOImpl implements EmployeesDAO{
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void save(Employees emp) {
		this.sessionFactory.getCurrentSession().save(emp);
	}

	@Override
	public Employees fetch(Employees emp) {
		
		return emp;
	}

	@Override
	public Employees delete(Employees emp) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employees update(Employees emp) {
		// TODO Auto-generated method stub
		return null;
	}
}
