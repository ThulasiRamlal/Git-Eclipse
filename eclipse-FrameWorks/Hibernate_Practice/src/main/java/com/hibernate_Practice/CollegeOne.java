package com.hibernate_Practice;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="clg_tbl")
public class CollegeOne {
	
	@Id
	@Column
	private int c_id;
	@Column
	private String c_name;
	@Column
	private String c_location;
	
	@OneToMany(targetEntity = DepartmentOne.class,cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name="c",referencedColumnName = "c_id")
	List<DepartmentOne> list; 
	
	public List<DepartmentOne> getList() {
		return list;
	}
	public void setList(List<DepartmentOne> list) {
		this.list = list;
	}
	public int getC_Id() {
		return c_id;
	}
	public void setId(int cid) {
		this.c_id = cid;
	}
	public String getC_name() {
		return c_name;
	}
	public void setC_name(String c_name) {
		this.c_name = c_name;
	}
	public String getC_location() {
		return c_location;
	}
	public void setC_location(String c_location) {
		this.c_location = c_location;
	}
	
}
