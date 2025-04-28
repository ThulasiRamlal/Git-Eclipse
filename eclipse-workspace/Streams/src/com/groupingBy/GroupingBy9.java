package com.groupingBy;

public class GroupingBy9 {
	int id;
	String name;
	String city;
	
	GroupingBy9(int id,String name,String city)
	{
		this.id=id;
		this.name=name;
		this.city=city;
	}
	
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public String getCity()
	{
		return city;
	}

	@Override
	public String toString() {
		return "GroupingBy9 [id=" + id + ", name=" + name + ", city=" + city + "]";
	}
	
	

}
