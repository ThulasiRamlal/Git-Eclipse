package com.mapping_practice;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="group_tbl")
public class Group {
	
	@Id
	@Column(name="g_id")
	private int id;
	@Column
	private String gname;
	@Column
	private String branch;
	@Column
	private int fees;
	
	@ManyToOne(targetEntity =College.class,cascade = CascadeType.ALL)
	@JoinColumn(name="g",referencedColumnName ="c_id")
	College clg;
	
	
	public College getClg() {
		return clg;
	}
	public void setClg(College clg) {
		this.clg = clg;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGname() {
		return gname;
	}
	public void setGname(String gname) {
		this.gname = gname;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public int getFees() {
		return fees;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}
	
}
