package com.OneToOne;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Passport {
	
	@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column
	private String passPortNumber;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPassPortNumber() {
		return passPortNumber;
	}

	public void setPassPortNumber(String passPortNumber) {
		this.passPortNumber = passPortNumber;
	}
}
