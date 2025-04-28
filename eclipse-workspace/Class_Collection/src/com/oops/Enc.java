package com.oops;

public class Enc {
	private String name;
	private int age;
	
	
	Enc(String name,int age)
	{
		this.name=name;
		this.age=age;
	}

	/*
	 * public String getName() { return name; }
	 * 
	 * public int getAge() { return age; }
	 */
	
	
	
	public static void main(String[] args) {
		Enc e= new Enc("Ramlal",10);
		System.out.println(e.toString());
		/*
		 * e.setAge(10); e.setName("Ramlal");
		 */
		/*
		 * System.out.println(e.getName()); System.out.println(e.getAge());
		 */
	}

	@Override
	public String toString() {
		return "Enc [name=" + name + ", age=" + age + "]";
	}
	

}
