package com.employee.dao;

import com.employee.model.Employees;

public interface EmployeesDao {
	public void save(Employees emp);
	public Employees fetch(Employees emp);
}
