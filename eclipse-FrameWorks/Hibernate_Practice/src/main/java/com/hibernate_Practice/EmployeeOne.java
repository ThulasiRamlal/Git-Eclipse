package com.hibernate_Practice;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="emp_one")
public class EmployeeOne {
	
	@Id
	@Column(name="emp_id")
	private int id;
	@Column(name="emp_name")
	private String name;
	@Column
	private String gender;
	@Column
	private float salary;
	
	@OneToOne(targetEntity = AddressOne.class,cascade = CascadeType.ALL)
	@JoinColumn(name="aa",referencedColumnName ="d_no")
	AddressOne add;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public AddressOne getAdd() {
		return add;
	}

	public void setAdd(AddressOne add) {
		this.add = add;
	}
	
}
