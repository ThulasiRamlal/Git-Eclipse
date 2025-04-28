package com.classPractice;

public class ObjectCounting2 {

	String name;
	int age;
	static int count=0;
	
	{
		count++;
		System.out.println("No of object created"
				+ " to student class: "+ObjectCounting2.count);
	}
	public static void main(String[] args) {
		ObjectCounting2 s1=new ObjectCounting2();
		ObjectCounting2 s2=new ObjectCounting2();
		ObjectCounting2 s3=new ObjectCounting2();
		System.out.println("ObjectCounting: "+s3.count);
		
		new ObjectCounting();
		new ObjectCounting();
}
}
