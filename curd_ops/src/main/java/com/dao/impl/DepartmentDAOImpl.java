package com.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dao.DepartmentDAO;
import com.entity.Department;

@Repository
public class DepartmentDAOImpl  implements DepartmentDAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void save(Department dept) {
		this.sessionFactory.getCurrentSession().save(dept);
		
	}

	@Override
	public Department fetch(Department dept) {
	
		return dept;
	}

	@Override
	public Department delete(Department dept) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Department update(Department dept) {
		// TODO Auto-generated method stub
		return null;
	}

}
