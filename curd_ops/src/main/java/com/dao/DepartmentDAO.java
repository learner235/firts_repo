package com.dao;

import com.entity.Department;

public interface DepartmentDAO {
	public void save(Department dept);
	public Department fetch(Department dept);

}
