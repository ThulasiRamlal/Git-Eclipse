package com.manyToMany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="organizations")
public class MyInstitute {
	
	
	//ins_stu - table name 1st
	//
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="i_id")
	private int id;
	@Column
	private String name;
	@Column
	private String location;
	
	@ManyToMany(targetEntity = MyStudent.class,cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinTable(name="ins_stu",joinColumns = @JoinColumn(name="i_fk_id",referencedColumnName = "i_id"),
	                            inverseJoinColumns = @JoinColumn(name="s_fk_id",referencedColumnName = "s_id"))
	List<MyStudent> slist;

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

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public List<MyStudent> getSlist() {
		return slist;
	}

	public void setSlist(List<MyStudent> slist) {
		this.slist = slist;
	}
}
