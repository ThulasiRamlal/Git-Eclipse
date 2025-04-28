package com.stream;

public class GroupingBy4 {
	int id;
	String name;
	String location;
	GroupingBy4(int id,String name,String location)
	{
	this.id=id;
	this.name=name;
	this.location=location;
	}
	//getters
	public int getId()
	{
	return id;
	}
	public String getName()
	{
	return name;
	}
	public String getLocation()
	{
	return location;
	}

	//toString Method
	public String toString()
	{
	return("id: "+id+" name: "+name+" Locations: "+location);
	}


}
