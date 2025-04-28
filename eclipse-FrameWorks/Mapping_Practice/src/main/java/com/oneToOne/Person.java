package com.oneToOne;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Person {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column
	private String name;
	
	@OneToOne(targetEntity = PassPort.class,cascade=CascadeType.ALL)
	@JoinColumn(name="passport_id",referencedColumnName="id")
	 private PassPort passport;

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

	public PassPort getPassport() {
		return passport;
	}

	public void setPassport(PassPort passport) {
		this.passport = passport;
	}
	
	 

}
