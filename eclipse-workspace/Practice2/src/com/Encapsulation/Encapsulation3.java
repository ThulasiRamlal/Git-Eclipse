package com.Encapsulation;

public class Encapsulation3 {
	private int id;
	private String name;
	private int age;
	Encapsulation3(int id,String name,int age)
	{
		this.id=id;
		this.name=name;
		this.age=age;
	}
	//fetching the data through in getters
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
	//fetching the data through toString() and it's Pre-difine method
    public String toString() {
    	return "[ id: "+id+" name: "+name+" age: "+age+" ]";
    }
    
    //fetching the data through user-defined method
    
    	public String display()
    	{
    	  return"[ id: "+id+" name: "+name+" age: "+age+" ]";	
    	}
    	public static void main(String[] args)
    	{
    		
    		 Encapsulation3 teja =new Encapsulation3(1,"Thulasi",22);
    		 System.out.println("getId: "+teja.getId());
    		 System.out.println("getName: "+teja.getName());
    		 System.out.println("getAge: "+teja.getAge());
    		 System.out.println("Using tostring(): "+teja.toString());
    		 System.out.println("Using User-Define method: "+teja.display());
    	}
    }

