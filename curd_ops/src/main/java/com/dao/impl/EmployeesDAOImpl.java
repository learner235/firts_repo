package com.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.dao.EmployeesDAO;
import com.entity.Employees;


public class EmployeesDAOImpl implements EmployeesDAO{

	@Override
	public void save(Employees emp) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employees","root","root");
			Statement smts = con.createStatement();
			smts.executeUpdate("INSERT INTO employees(emp_no,birth_date,first_name,last_name,gender,hire_date) VALUES('"+emp.getEmp_no()+"','"+emp.getBirth_date()+"','"+emp.getFirst_name()+"','"+emp.getLast_name()+"','"+emp.getGender()+"','"+emp.getHire_date()+"')");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public Employees fetch(Employees emp) {
		try {	
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employees","root","root");
			
			Statement smts = con.createStatement();
			ResultSet rs = smts.executeQuery("SELECT * FROM employees WHERE dept_no =  '"+emp.getEmp_no()+"'" );
			while(rs.next()) { 
				emp.setEmp_no(rs.getInt(1));
				emp.setBirth_date(rs.getDate(1));
				emp.setFirst_name(rs.getString(3));
				emp.setLast_name(rs.getString(4));
				emp.setGender(rs.getNString(5));
				emp.setHire_date(rs.getDate(6));
			} 
		} catch (Exception e) {
			e.printStackTrace();
		}
		return emp;
	}
}
