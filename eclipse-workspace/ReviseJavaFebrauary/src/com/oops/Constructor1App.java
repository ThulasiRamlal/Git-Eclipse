package com.oops;

public class Constructor1App {
	public static void main(String[] args) {
		Constructor1 c=new Constructor1(1, "Thulasi", 21);
		Constructor1 c1=new Constructor1(2,"Ramlal",22);
		System.out.println(c.toString());
		System.out.println(c1.toString());

     System.out.println(c.getId());
     System.out.println(c.getName());
     System.out.println(c.getAge());
		
		
		
	}

}
