package com.collections;

public class GroupBy2 {
	int id;
	String name;
	String city;
	
	public GroupBy2(int id,String name,String city)
	{
		this.id=id;
		this.name=name;
		this.city=city;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getCity() {
		return city;
	}

	@Override
	public String toString() {
		return "GroupBy2 [id=" + id + ", name=" + name + ", city=" + city + "]";
	}
	
	

}
