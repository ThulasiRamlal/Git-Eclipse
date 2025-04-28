package com.strings;

public class String1 {
	
	public static void main(String[] args) {
		String s="ramlal";
		String s1=new String("ramlal");
		String s2="ramlal";
		String s3=new String("ramlal");
		String s4=new String("thulasi");
		String s5="thulasi";
		
		
		//equals method :- it is used for compare both values or content  of strings.
		//== operator :- it is used for compare the refernces of both strings.
		
		//Equals()
		System.out.println(s.equals(s1)); //true
		System.out.println(s.equals(s2)); //true
		System.out.println(s1.equals(s3)); //true
		System.out.println(s3.equals(s4)); //false
		
		System.out.println("=======================================");
		//String literal
		System.out.println(s==s1); //false
		System.out.println(s==s2); //True
		System.out.println(s==s5); // false
		
		
		
		
	}

}
