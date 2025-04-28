package com.classPractice;

public class ObjectCounting {
String name;
int age;
static int count=0;
public ObjectCounting()
{
	count++;
}
public static void main(String[] args) {
	ObjectCounting s1=new ObjectCounting();
	ObjectCounting s2=new ObjectCounting();
	ObjectCounting s3=new ObjectCounting();
	System.out.println("No of object created"
			+ " to student class: "+ObjectCounting.count);
	new ObjectCounting();
	new ObjectCounting();
}
}
