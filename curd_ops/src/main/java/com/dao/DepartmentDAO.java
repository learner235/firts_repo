package com.dao;

import com.entity.Department;

public interface DepartmentDAO {
	public void save(Department dept);
	public Department fetch(Department dept);
	public Department delete(Department dept);
	public Department update(Department dept);

}
