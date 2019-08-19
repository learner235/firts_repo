package com.entity;
import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.OneToOne;
import javax.persistence.JoinColumn;

@Entity(name="DeptEmp")
@Table(name="dept_emp")

public class DeptEmp {
	
	 @EmbeddedId
	private EmployeeId id;
	private Date from_date;
	private Date to_date;
	
	 @OneToOne
	 @JoinColumn(name="emp_no")
	 public Employees emp_no;
	 
	 @OneToOne
	 @JoinColumn(name="dept_no")
	 public Department dept_no;
	
	 public DeptEmp()
	 {
		 
	 }
	 
	public EmployeeId getId()
	{
		return id;
	}
	
	public void setId(EmployeeId id)
	{
		this.id=id;
	}
	
	
	public Date getFrom_date() {
		return from_date;
		
	}
	
	public void setFrom_date(Date from_date)
	{
		this.from_date=from_date;
	}
	
	public Date getTo_date()
	{
		return to_date;
	}
	
	public void setTo_date()
	{
		this.to_date=to_date;
	}
	
	 public DeptEmp(Date from_date, Date to_date)
	 {
		 this.from_date=from_date;
		 this.to_date=to_date;
		 
	 }
	 
}






/*

CREATE TABLE dept_manager (

		   emp_no       INT             NOT NULL,

		   dept_no      CHAR(4)         NOT NULL,

		   from_date    DATE            NOT NULL,

		   to_date      DATE            NOT NULL,

		   FOREIGN KEY (emp_no)  REFERENCES employees (emp_no)    ON DELETE CASCADE,

		   FOREIGN KEY (dept_no) REFERENCES departments (dept_no) ON DELETE CASCADE,

		   PRIMARY KEY (emp_no,dept_no)

		);
*/



