package com.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/*--------------------------  Entity Class -----------------------------------*/
@Entity(name = "Titles")
@Table(name = "titles")
public class Titles implements Serializable
{
	@Id
	@Column(name="t_id")
	private int  t_id;
	
	@JoinColumn(name = "emp_no", unique = true)
    @OneToOne(cascade = CascadeType.ALL)
    private Employees emp;
	
	@Column(name="title", nullable=false)
	private String title;
	
	@Column(name="from_date", nullable=false)
	private String fromDate;
	
	@Column(name="to_date", nullable=false)
	private String toDate;

	public Titles() { }

	public int getT_id() {
		return t_id;
	}

	public void setT_id(int t_id) {
		this.t_id = t_id;
	}

	public Employees getEmp() {
		return emp;
	}

	public void setEmp(Employees emp) {
		this.emp = emp;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
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
