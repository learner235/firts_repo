package com.dao;

import com.entity.Employees;

public interface EmployeesDAO {
	public void save(Employees emp);
	public Employees fetch(Employees emp);
}
