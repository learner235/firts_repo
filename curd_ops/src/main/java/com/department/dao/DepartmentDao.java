package com.department.dao;

import com.department.model.Department;

public interface DepartmentDao {
	public void save(Department dept);
	public Department fetch(Department dept);

}
