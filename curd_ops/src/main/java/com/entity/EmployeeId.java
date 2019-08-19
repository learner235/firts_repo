package com.entity;
import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;


@Embeddable
public class EmployeeId implements Serializable {
	@Column(name="emp_no")
	private int emp_no;
	
	@Column(name="dept_no")
	private String dept_no;

	public EmployeeId()
{
		
}

public EmployeeId(int emp_no, String dept_no)
{
	this.emp_no=emp_no;
	this.dept_no=dept_no;
}

public int getEmp_no()
{
	return emp_no;
}

public String getDept_no()
{
	return dept_no;
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