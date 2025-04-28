package com.stream;

public class Stream3 {
	public static void main(String[] args) {
		String s="java";
		String s2="java";
		String s1=new String("java");
		String s3=new String("java");
		System.out.println(s.equals(s1));
		System.out.println(s==s2);
		System.out.println(s1==s3);
	}

}
