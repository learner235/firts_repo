package com.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/*--------------------------  Entity Class -----------------------------------*/
@Entity(name = "Salaries")
@Table(name = "salaries")
public class Salaries
{
	@Id
	@Column(name="s_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int s_id;
	
	@JoinColumn(name = "emp_no", unique = true)
    @OneToOne(cascade = CascadeType.ALL)
    private Employees emp;
	
	@Column(name="salarey", nullable=false)
	private int salary;
	
	@Column(name="from_date", nullable=false)
	private String fromDate;
	
	@Column(name="to_date", nullable=false)
	private String toDate;

	public Salaries() {
		super();
	}

	public int getS_id() {
		return s_id;
	}

	public void setS_id(int s_id) {
		this.s_id = s_id;
	}

	public Employees getEmp() {
		return emp;
	}

	public void setEmp(Employees emp) {
		this.emp = emp;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getFromDate() {
		return fromDate;
	}

	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}

	public String getToDate() {
		return toDate;
	}

	public void setToDate(String toDate) {
		this.toDate = toDate;
	}
	
	
	
}


