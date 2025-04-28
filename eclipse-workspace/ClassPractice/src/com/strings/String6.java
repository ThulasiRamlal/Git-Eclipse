package com.strings;

public class String6 {
	static String a;
	public static void main(String[] args) {
		
		String s=new String("ramlal");
		String s1=s.intern();
		String s3="ramlal";
		if(s1==s3)
		{
			System.out.println("refernces are equal");
		}
		else
		{
			System.out.println("refernce are not equal");
		}
		System.out.println("===============================");
		System.out.println(a);
	}

}
