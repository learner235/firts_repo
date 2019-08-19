package com.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.dao.DepartmentDAO;
import com.entity.Department;

public class DepartmentDAOImpl  implements DepartmentDAO{

	@Override
	public void save(Department dept) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/department","root","root");
			Statement smts = con.createStatement();
			smts.executeUpdate("INSERT INTO department(dept_no,dept_name) VALUES('"+dept.getDept_no()+"','"+dept.getDept_name()+"')");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public Department fetch(Department dept) {
		try {	
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/department","root","root");
			
			Statement smts = con.createStatement();
			ResultSet rs = smts.executeQuery("SELECT * FROM department WHERE dept_no =  '"+dept.getDept_no()+"'" );
			while(rs.next()) { 
				dept.setDept_no(rs.getString(1));
				dept.setDept_name(rs.getString(2));
			} 
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dept;
	}

}
