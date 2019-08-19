package com.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/*--------------------------  Entity Class -----------------------------------*/
@Entity(name = "Salaries")
@Table(name = "salaries")
public class Salaries
{
	@EmbeddedId
	private SalariesPK spk;
	private int salary;
	private String endDate;
	
	@OneToOne
    @JoinColumn(name = "emp_no")
	private Employees empNo;
	
	public SalariesPK getSpk() {
		return spk;
	}
	public void setSpk(SalariesPK spk) {
		this.spk = spk;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public Employees getEmpNo() {
		return empNo;
	}
	public void setEmpNo(Employees empNo) {
		this.empNo = empNo;
	}	
	
}

/*--------------------------  Composite Key Class -----------------------------------*/
@Embeddable
class SalariesPK implements Serializable
{
	@Column(name="emp_no", nullable=false)
	protected int empNo;
	
	@Column(name="from_date", nullable=false)
	protected String fromDate;

	public SalariesPK() { }

	public SalariesPK(int empNo, String fromDate) {
		this.empNo = empNo;
		this.fromDate = fromDate;
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getFromDate() {
		return fromDate;
	}

	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}
}

