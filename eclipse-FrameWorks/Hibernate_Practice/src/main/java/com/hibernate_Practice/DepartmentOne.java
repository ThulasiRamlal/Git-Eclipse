package com.hibernate_Practice;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="dept_tbl")
public class DepartmentOne {
	
	@Id
	@Column
	private int id;
	@Column
	private String d_name;
	@Column
	private String d_fees;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getD_name() {
		return d_name;
	}
	public void setD_name(String d_name) {
		this.d_name = d_name;
	}
	public String getD_fees() {
		return d_fees;
	}
	public void setD_fees(String d_fees) {
		this.d_fees = d_fees;
	}
	
}
