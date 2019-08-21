package com.entity;
import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.OneToOne;
import javax.persistence.JoinColumn;

@Entity(name="DeptManager")
@Table(name="dept_manager")
public class DeptManager {


	
	/*
	@Column(name="emp_no", nullable =false)
	private int emp_no;
	*/
	
	@Id
	@Column(name="man_id", nullable = false)
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int man_id;
	
	@Column(name="from_date", nullable =false)
	private Date from_date;
	
	@Column(name="to_date", nullable=false)
	private Date to_date;
	
	
	 @OneToOne
	 @JoinColumn(name="emp_no")
	 private Employees emp_no;
	 
	
	 @OneToOne
	 @JoinColumn(name="dept_no")
	 private Department dept_no;
	 
	 public DeptManager()
	 {
		 
	 }

	public Department getDept_no() {
		return dept_no;
	}

	public void setDept_no(Department dept_no) {
		this.dept_no = dept_no;
	}

	public Employees getEmp_no() {
		return emp_no;
	}

	public void setEmp_no(Employees emp_no) {
		this.emp_no = emp_no;
	}

	public Date getFrom_date() {
		return from_date;
	}

	public void setFrom_date(Date from_date) {
		this.from_date = from_date;
	}

	public Date getTo_date() {
		return to_date;
	}

	public void setTo_date(Date to_date) {
		this.to_date = to_date;
	}
	

}


