package com.designPattrens;

public class Class1Test {
	public static void main(String[] args) {
		Class1 s1=new Class1("Thulasi", 22);
		System.out.println(s1);
		s1.display();
		System.out.println("=========================");
		Class1 s2=new Class1("Ramlal",32);
		System.out.println(s2);
		s2.display();
		System.out.println("==========================");
		Class1 s3=s2;
		System.out.println(s3);
		s3.display();
	}

}
