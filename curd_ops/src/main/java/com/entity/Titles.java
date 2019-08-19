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
@Entity(name = "Titles")
@Table(name = "titles")
public class Titles implements Serializable
{
	@EmbeddedId
	private TitlesPK tmpk;
	private String toDate;
	
	@OneToOne
    @JoinColumn(name="emp_no")
	private Employees empNo;
	
	public TitlesPK getTmpk() {
		return tmpk;
	}
	public void setTmpk(TitlesPK tmpk) {
		this.tmpk = tmpk;
	}
	public String getToDate() {
		return toDate;
	}
	public void setToDate(String toDate) {
		this.toDate = toDate;
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
class TitlesPK implements Serializable
{
	@Column(name="emp_no", nullable=false)
	protected int empNo;
	
	@Column(name="title", nullable=false)
	protected String title;
	
	@Column(name="from_date", nullable=false)
	protected String fromDate;
	
	public TitlesPK() { }

	public TitlesPK(int empNo, String title, String fromDate) {
		this.empNo = empNo;
		this.title = title;
		this.fromDate = fromDate;
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
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
}
