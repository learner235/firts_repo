package com.entity;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="department")
public class Department implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="dept_no")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long dept_no;
	
	@Column(name="dept_name")
	private String dept_name;
	
	
	
	public Long getDept_no() {
		return dept_no;
	}

	public void setDept_no(Long dept_no) {
		this.dept_no = dept_no;
	}

	public String getDept_name() {
		return dept_name;
	}
	
	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}

	@Override
	public String toString() {
		return "Department [dept_no=" + dept_no + ", dept_name=" + dept_name + "]";
	}
	
} 