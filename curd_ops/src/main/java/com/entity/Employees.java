package com.entity;

import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employees")
public class Employees {
	
	@Id
	@Column(name="emp_no", nullable = false)
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int emp_no;
	
	@Column(name="birth_date", nullable = false)
	private Date birth_date;
	
	@Column(name="first_name" , nullable = false)
	private String first_name;
	
	@Column(name="last_name" , nullable = false)
	private String last_name;
	
	@Column(name="gender" , nullable = false)
	private String gender;
	
	@Column(name="hire_date" , nullable = false)
	private Date hire_date;
	
	public int getEmp_no() {
		return emp_no;
	}
	
	public void setEmp_no(int emp_no) {
		this.emp_no = emp_no;
	}
	
	public Date getBirth_date() {
		return birth_date;
	}
	
	public void setBirth_date(Date birth_date) {
		this.birth_date = birth_date;
	}
	
	public String getFirst_name() {
		return first_name;
	}
	
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	
	public String getLast_name() {
		return last_name;
	}
	
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	
	public String getGender() {
		return gender;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public Date getHire_date() {
		return hire_date;
	}
	
	public void setHire_date(Date hire_date) {
		this.hire_date = hire_date;
	}
	
}